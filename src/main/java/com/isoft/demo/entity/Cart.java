package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart implements Serializable {
    private int cartId;
    private int cartGoods;
    private int cartNum;
    private double cartPrice;
    private int cartUserId;
}
