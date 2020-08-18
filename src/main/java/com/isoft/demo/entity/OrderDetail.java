package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail implements Serializable {
    private int detailId;
    private String detailOrder;
    private String detailGoodsId;
    private double detailPrice;
    private int detailNum;
}
