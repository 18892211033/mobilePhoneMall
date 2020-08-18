package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private int userId;
    private String userName;
    private String userPass;
    private String userPhone;
    private String userEmail;
    private String userState;
    private String userPhoneUrl;
}
