package com.sonar.vishal.medico.data;

import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("header")
    public Header header;

    @SerializedName("body")
    public Data data;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
