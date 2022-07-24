package com.sonar.vishal.medico.middleware.restcontroller;

import com.sonar.vishal.medico.data.Data;
import com.sonar.vishal.medico.data.body.ErrorResponse;
import com.sonar.vishal.medico.data.body.LoginRequest;
import com.sonar.vishal.medico.data.body.LoginResponse;
import com.sonar.vishal.medico.middleware.constant.TagConstant;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/auth")
@Api(tags = TagConstant.AUTHENTICATION_TAG)
public class LoginRestController {

    @PostMapping("/login")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Login Successfully",
                    content = @Content(schema = @Schema(implementation = LoginResponse.class))),
            @ApiResponse(responseCode = "400", description = "Client Error",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Server Error",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @io.swagger.v3.oas.annotations.parameters.RequestBody(required = true)
    public ResponseEntity<Data> login(@RequestBody LoginRequest request) {
        try {
            return ResponseEntity.ok(new LoginResponse());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ErrorResponse());
        }
    }
}
