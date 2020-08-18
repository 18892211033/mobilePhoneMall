package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evaimg implements Serializable {
    private int evaId;
    private int evaUserId;
    private String evaContent;
    private Date evaDate;
    private int evaGoodsId;
    private int evaState;
    private int evalevel;
}
