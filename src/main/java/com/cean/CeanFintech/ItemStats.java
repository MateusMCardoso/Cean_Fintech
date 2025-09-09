package com.cean.CeanFintech;

public enum ItemStats {
    EFETIVADO("Efetivado"),
    PENDENTE("Pendente");

    private final String itemStatsView;

    ItemStats(String itemStatsView){
        this.itemStatsView = itemStatsView;
    }

    public String getItemStatsView(){
        return itemStatsView;
    }
}
