package com.example.accountApplication.Dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {
    private String firstName;

    private String lastName;

    private String gender;

    private String email;

    private String residentialAddress;

    private String phoneNo;

    private String nationality;

    private String accountType;

    private String pin;
}
