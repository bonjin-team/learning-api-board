package kr.co.bonjin.learningapiboard.response;

import kr.co.bonjin.learningapiboard.exception.ApiError;

public class ApiResponse {

    //공통적으로 갖고 있는것
    private String status;
    private ApiError error;

    public ApiResponse() {
        status = "OK";
        error = new ApiError("", "");
    }

    public ApiResponse(ApiError error) {
        status = "Failed";
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApiError getError() {
        return error;
    }

    public void setError(ApiError error) {
        this.error = error;
    }
}
