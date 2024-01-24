package org.notebook.entrypoint.controller;



import org.notebook.entrypoint.dto.CreateUserRequest;
import org.notebook.entrypoint.dto.CreateUserResponse;
import org.notebook.rest.RestAPICode;
import org.notebook.rest.RestResponse;
import org.notebook.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/signup")
    public RestResponse<CreateUserResponse> signup(@Valid @RequestBody CreateUserRequest createUserRequest){
        if (userService.isUserCreated(createUserRequest.getEmail())){
            return RestResponse.of("Email already registered", 409);
        }
        CreateUserResponse response= userService.createUser(createUserRequest);
        return RestResponse.of(response,"user created", RestAPICode.OK_STATUS_CODE);
    }

//    public RestResponse<> login(){
//
//    }
}
