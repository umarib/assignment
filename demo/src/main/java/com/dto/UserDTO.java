package com.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserDTO {

    private long id;
    private String name;
    private String gender;
    private Date dob;
    private int age;

}
