package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doods implements Serializable {
    private int goodsId;
    private String goodName;
    private double goosPrice;
    private int goodsNum;
    private String goodsType;
    private int goodsMemory;
    private String goodsColor;
    private String goodsImgUrl;
    private String goodsState;
}
