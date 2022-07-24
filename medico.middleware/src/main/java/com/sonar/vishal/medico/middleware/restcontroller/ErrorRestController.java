package com.sonar.vishal.medico.middleware.restcontroller;

import com.sonar.vishal.medico.data.body.ErrorResponse;
import com.sonar.vishal.medico.middleware.constant.TagConstant;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = TagConstant.ERROR_TAG, hidden = true)
public class ErrorRestController implements ErrorController {

    @RequestMapping("/error")
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ApiResponse(responseCode = "500", description = "Server Error",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    public ErrorResponse errorHandler() {
        return new ErrorResponse();
    }
}
