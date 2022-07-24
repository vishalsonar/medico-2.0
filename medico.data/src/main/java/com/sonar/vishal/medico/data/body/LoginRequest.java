package com.sonar.vishal.medico.data.body;

import com.google.gson.annotations.SerializedName;
import com.sonar.vishal.medico.data.Data;

public class LoginRequest extends Data {

    @SerializedName("userName")
    private String userName;

    @SerializedName("password")
    private String password;

    public String getUserName() {
        return userName;
    }

    public LoginRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginRequest setPassword(String password) {
        this.password = password;
        return this;
    }
}
