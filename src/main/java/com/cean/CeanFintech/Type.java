package com.cean.CeanFintech;

public enum Type {
        RECEITA("Receita"),
        DESPESA("Despesa");

        private final String typeView;

        Type(String typeView){
            this.typeView = typeView;
        }

        public String getTypeView(){
            return typeView;
        }
}
