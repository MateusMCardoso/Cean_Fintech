package com.cean.CeanFintech;

public enum PaymentMethod {
    CREDITO("Cartão de Crédito"),
    DEBITO("Cartão de Débito"),
    PIX("Pix"),
    DINHEIRO("Dinheiro");

    private final String paymentMethod;

    PaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }
}
