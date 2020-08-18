package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private int orderId;
    private int orderUserId;
    private Date orderDate;
    private double orderPrice;
    private String orderState;
    private String orderUserName;
    private String orderUserPhone;
    private String orderAddress;
    private String orderNo;
}
