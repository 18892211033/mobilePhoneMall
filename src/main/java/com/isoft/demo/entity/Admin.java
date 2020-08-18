package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
    private int adminId;
    private String adminName;
    private String adminPassword;
    private String adminPhone;
    private Date adminDate;
    private int adminRoleId;
}
