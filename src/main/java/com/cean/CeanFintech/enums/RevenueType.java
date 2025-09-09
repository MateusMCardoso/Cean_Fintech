package com.cean.CeanFintech.enums;

public enum RevenueType {
    SALARIO("Salário"),
    EXTRA("Receita extra");

    private final String revenueType;

    RevenueType(String revenueType){
        this.revenueType = revenueType;
    }

    public String getRevenueType(){
        return revenueType;
    }
}
