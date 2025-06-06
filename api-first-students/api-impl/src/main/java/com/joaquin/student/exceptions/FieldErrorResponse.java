package com.joaquin.student.exceptions;

import java.util.Map;

public class FieldErrorResponse extends  ErrorResponse{

    private Map<String, String> errors;

    public FieldErrorResponse(String message, String details, int error, Map<String, String> errors) {
        super(message, error, details);
        this.errors = errors;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
