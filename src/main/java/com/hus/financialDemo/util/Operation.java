package com.hus.financialDemo.util;

public enum Operation {
    _DIRECT("DIRECT"),
    _REFUND("REFUND"),
    _3D("3D"),
    _3DAUTH("3DAUTH"),
    _STORED("STORED");

    private String value;

    Operation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
