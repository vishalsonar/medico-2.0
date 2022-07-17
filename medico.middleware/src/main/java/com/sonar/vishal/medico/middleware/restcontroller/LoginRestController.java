package com.sonar.vishal.medico.middleware.restcontroller;

import com.sonar.vishal.medico.middleware.constant.TagConstant;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/auth")
@Api(tags = TagConstant.AUTHENTICATION_TAG)
public class LoginRestController {

    @PostMapping("/login")
    public String login() {
        return "login";
    }
}
