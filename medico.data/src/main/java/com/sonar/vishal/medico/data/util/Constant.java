package com.sonar.vishal.medico.data.util;

import com.google.gson.Gson;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Constant {

    public static final Gson GSON = new Gson();
    public static final MessageDigest MESSAGE_DIGEST = getMessageDigest();

    public static final String EMPTY = "";
    public static final Charset UTF_8 = StandardCharsets.UTF_8;
    public static final String ALGORITHM_NAME = "SHA3-512";

    public static MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance(Constant.ALGORITHM_NAME);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
