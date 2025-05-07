package com.example.cryptoshop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDTO {
    public long id;
    public double wallet;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
