package com.sonar.vishal.medico.data;

import com.sonar.vishal.medico.data.util.Constant;

public class Data {

    protected String generateMAC(Data data) {
        String message = Constant.GSON.toJson(data).toString();
        byte[] messageByte = Constant.MESSAGE_DIGEST.digest(message.getBytes());
        return new String(messageByte, Constant.UTF_8);
    }
}
