package com.sonar.vishal.medico.data.body;

import com.google.gson.annotations.SerializedName;
import com.sonar.vishal.medico.data.Data;

public class ErrorResponse extends Data {

    @SerializedName("errorCode")
    private String errorCode;

    @SerializedName("errorMessage")
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public ErrorResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ErrorResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
