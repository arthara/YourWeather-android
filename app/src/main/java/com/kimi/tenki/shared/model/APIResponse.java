package com.kimi.tenki.shared.model;

import com.google.gson.annotations.SerializedName;

public abstract class APIResponse {
    @SerializedName("cod")
    protected int code;
    @SerializedName("message")
    protected String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
