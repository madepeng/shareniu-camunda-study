package com.shareniu.Test.bean;

import java.io.Serializable;

/**
 * @ClassName ValueBean
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/5/12
 * @Version V1.0
 **/

public class ValueBean implements Serializable {
    private String value;

    public ValueBean(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
