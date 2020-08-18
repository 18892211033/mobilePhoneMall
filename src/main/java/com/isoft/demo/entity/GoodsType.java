package com.isoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsType implements Serializable {
    private int typeId;
    private String typeName;
    private int typePid;
    private int typeLv;
    private String typePath;
    private String typeState;
}
