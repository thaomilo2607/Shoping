package com.example.java6.Payload.Respone;

import java.util.Date;

public class HttpRespone {
    private int status;
    private String message;
    private String timestamp;
    private Object data;

    public HttpRespone(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date().toString();
        this.data = data;

    }
}
