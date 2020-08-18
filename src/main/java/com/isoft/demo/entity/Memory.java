package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Memory implements Serializable {
    private int memoryId;
    private int memoryUserId;
    private int memoryGoodsId;
    private String goodsImgUrl;
    private double goosPrice;
    private Date memoryCreateTime;
}
