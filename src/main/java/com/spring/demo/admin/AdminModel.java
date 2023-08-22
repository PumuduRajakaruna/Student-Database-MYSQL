package com.spring.demo.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdminModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
