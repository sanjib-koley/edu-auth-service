package com.sanjib.edureka.ms_auth_service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CredentialView {

    private String email;
    private String phone;
    private String password;
    private String usertype;
}
