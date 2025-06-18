package com.codemakers.commons.dtos;

import lombok.Data;

@Data
public class LoginRequestDTO {
    private String username;
    private String password;
}
