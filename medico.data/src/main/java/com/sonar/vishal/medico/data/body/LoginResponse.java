package com.sonar.vishal.medico.data.body;

import com.google.gson.annotations.SerializedName;
import com.sonar.vishal.medico.data.Data;

public class LoginResponse extends Data {

    @SerializedName("token")
    public String token;

    public String getToken() {
        return token;
    }

    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }
}
