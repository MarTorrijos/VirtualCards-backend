package com.virtualcards.dto.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthenticationRequestDto {

    @NotBlank
    @Size(min = 3, max = 35)
    private String username;

    @NotBlank
    @Size(min = 6, max = 64)
    private String password;

}