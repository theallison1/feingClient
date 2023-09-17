package com.example.Feingclient.client;

import com.example.Feingclient.model.Todo;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.net.URI;

@FeignClient(name = "todoClient")
public interface TodoClient {
    @RequestLine(value = "GET")
    Todo getTodoById(URI uri);
}