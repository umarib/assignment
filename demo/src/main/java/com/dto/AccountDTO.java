package com.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountDTO {

    private BigDecimal balance;
    private String currency;
    private UserDTO user;

}
