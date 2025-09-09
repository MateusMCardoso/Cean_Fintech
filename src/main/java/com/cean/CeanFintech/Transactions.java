package com.cean.CeanFintech;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Transactions {

    private final Long id;

    private final String name;
    private final BigDecimal value;
    private final LocalDate date;
    private final String note;

    private final Type type;
    private final ItemStats stats;

    private final Category category;

    protected Transactions(Long id, String name, BigDecimal value, LocalDate date, String note, Type type, ItemStats stats, Category category) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.date = date;
        this.note = note;
        this.type = type;
        this.stats = stats;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    public Type getType() {
        return type;
    }

    public ItemStats getStats() {
        return stats;
    }

    public Category getCategory() {
        return category;
    }

}
