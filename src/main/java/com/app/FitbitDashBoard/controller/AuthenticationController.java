package com.app.FitbitDashBoard.controller;

import com.app.FitbitDashBoard.model.User;
import com.app.FitbitDashBoard.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;
    private UserService userService;
  @PostMapping("/register")
    public ResponseEntity<User> register(
            @RequestBody RegisterRequest request){
        return service.register(request);
   }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authentication(
            @RequestBody AuthenticationRequest request){

        return  ResponseEntity.ok(service.authenticate(request));

    }



}
