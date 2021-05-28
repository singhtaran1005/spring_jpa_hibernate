package com.example.jpa_beans.demo_jpa;

public class Hello {

    private String message;
    private String data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "message='" + this.message + '\'' +
                ", data='" + this.data + '\'' +
                '}';
    }
}
