package com.interview.coins.exception;

import org.springframework.http.HttpStatus;

public class ApplicationException extends RuntimeException{

    private final ApiErrorResponse responseBody;

    public ApplicationException(String message) {
        super(message);
        responseBody = new ApiErrorResponse(  HttpStatus.NOT_FOUND,message,"Cause Message");
    }

    public ApiErrorResponse getResponseBody() {
        return responseBody;
    }
}
