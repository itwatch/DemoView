package com.hnshangyu.huirongfa.model.base;

import java.io.Serializable;


public class ErrorMessage implements Serializable {

    private String errorCode = "0";
    private String errorMessage = "";

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
