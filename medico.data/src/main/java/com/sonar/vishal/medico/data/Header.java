package com.sonar.vishal.medico.data;

import com.google.gson.annotations.SerializedName;
import com.sonar.vishal.medico.data.annotation.Default;

public class Header {

    @SerializedName("Channel")
    @Default("web, mobile")
    public String channel;

    @SerializedName("Authorization")
    @Default("Bearer QWxhZGRpbjpvcGVuIHNlc2FtZQ==")
    public String authorization;

    @SerializedName("Content-Type")
    @Default("application/json")
    public String contentType;

    @SerializedName("Accept")
    @Default("application/json")
    public String accept;

    @SerializedName("Accept-Charset")
    @Default("utf-8")
    public String acceptCharset;

    @SerializedName("Accept-Language")
    @Default("en-IN")
    public String acceptLanguage;

    @SerializedName("Date")
    @Default("Mon, 12 Feb 1996 23:30:00 IST")
    public String date;

    @SerializedName("Host")
    @Default("medico")
    public String host;

    @SerializedName("Pragma")
    @Default("no-cache")
    public String pragma;

    @SerializedName("Server")
    @Default(value = "medico", isServerParameter = true)
    public String server;

    @SerializedName("Mac")
    @Default("QWxhZGRpbjpvcGVuIHNlc2FtZQ==")
    public String mac;

    public String getAuthorization() {
        return authorization;
    }

    public Header setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public Header setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getAccept() {
        return accept;
    }

    public Header setAccept(String accept) {
        this.accept = accept;
        return this;
    }

    public String getAcceptCharset() {
        return acceptCharset;
    }

    public Header setAcceptCharset(String acceptCharset) {
        this.acceptCharset = acceptCharset;
        return this;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public Header setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Header setDate(String date) {
        this.date = date;
        return this;
    }

    public String getHost() {
        return host;
    }

    public Header setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPragma() {
        return pragma;
    }

    public Header setPragma(String pragma) {
        this.pragma = pragma;
        return this;
    }

    public String getServer() {
        return server;
    }

    public Header setServer(String server) {
        this.server = server;
        return this;
    }

    public String getMac() {
        return mac;
    }

    public Header setMac(String mac) {
        this.mac = mac;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public Header setChannel(String channel) {
        this.channel = channel;
        return this;
    }
}
