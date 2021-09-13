package kr.co.bonjin.learningapiboard.exception;

import kr.co.bonjin.learningapiboard.response.ApiResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public ApiResponse runtimeExceptionHandler(RuntimeException e) {
        if ( e instanceof ApiException ) {
            ApiException apiE = (ApiException) e;
            ApiError apiError = new ApiError(apiE.getCode(), apiE.getMessage());
            return new ApiResponse(apiError);
        }

        ApiError internalServerError = ApiError.INTERNAL_SERVER_ERROR;
        internalServerError.setMessage(e.getMessage());
        return new ApiResponse(internalServerError);
    }
}
