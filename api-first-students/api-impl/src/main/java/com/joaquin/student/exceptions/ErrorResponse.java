package com.joaquin.student.exceptions;


import lombok.Data;

@Data
public class ErrorResponse {
    private String message;
    private String details;
    private int error;

    public ErrorResponse(String message, int error, String details) {
        this.message = message;
        this.error = error;
        this.details = details;
    }

    public ErrorResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
