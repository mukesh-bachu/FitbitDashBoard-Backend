package com.app.FitbitDashBoard.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String Name;
    private String email;
    private String password;
    private String fitbitUrl;
    private String phone;


}
