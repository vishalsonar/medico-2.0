package com.sonar.vishal.medico.middleware.restcontroller;

import com.sonar.vishal.medico.middleware.constant.TagConstant;
import io.swagger.annotations.Api;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = TagConstant.ERROR_TAG)
public class ErrorRestController implements ErrorController {

    @RequestMapping("/error")
    public String error() {
        return "error";
    }
}
