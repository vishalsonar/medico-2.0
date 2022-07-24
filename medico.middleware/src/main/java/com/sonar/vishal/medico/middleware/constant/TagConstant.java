package com.sonar.vishal.medico.middleware.constant;

import springfox.documentation.service.Tag;

public class TagConstant {

    public static final String ERROR_TAG = "Error";
    public static final String AUTHENTICATION_TAG = "Authentication";

    public static final String ERROR_TAG_DESCRIPTION = "Error API";
    public static final String AUTHENTICATION_TAG_DESCRIPTION = "Login, Logout and Oauth API";

    public static final Tag ERROR = new Tag(ERROR_TAG, ERROR_TAG_DESCRIPTION);
    public static final Tag AUTHENTICATION = new Tag(AUTHENTICATION_TAG, AUTHENTICATION_TAG_DESCRIPTION);
}
