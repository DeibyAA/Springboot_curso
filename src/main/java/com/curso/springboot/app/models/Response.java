package com.curso.springboot.app.models;

import java.util.HashMap;
import java.util.Map;

public class Response {

    private Integer status;
    private String message;
    private Object body;

    public Response(Integer status, String message, Object body){
        this.status = status;
        this.message = message;
        this.body = body;
    }

    public Map<String, Object> getResponse() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", status);
        response.put("message", message);
        response.put("body", body);
        return response;
    }
}
