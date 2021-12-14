package ru.geekbrains;

import ru.geekbrains.domain.HttpRequest;
import ru.geekbrains.domain.HttpResponse;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ResponseParcer {
    public HttpResponse parseResponse(Deque<String> rawRequest) {
        String[] firstLine = rawRequest.pollFirst().split(" ");
        String code = firstLine[0];
        String url = firstLine[1];

        Map<String, String> headers = new HashMap<>();
        while (!rawRequest.isEmpty()) {
            String line = rawRequest.pollFirst();
            if (line.isBlank()) {
                break;
            }
            String[] header = line.split(": ");
            headers.put(header[0], header[1]);
        }
        StringBuilder body = new StringBuilder();
        while (!rawRequest.isEmpty()) {
            body.append(rawRequest.pollFirst());
        }
        return new HttpResponse(code, url, headers, body.toString());
    }
}
