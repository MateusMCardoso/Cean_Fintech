package com.cean.CeanFintech.model;

import com.cean.CeanFintech.enums.ItemStats;
import com.cean.CeanFintech.enums.RevenueType;
import com.cean.CeanFintech.enums.Type;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Revenue extends Transactions {

    private final String payer;
    private final RevenueType revenueType;

    private Revenue(Revenue.RevenueBuilder builder) {
        super(builder.id, builder.name, builder.value, builder.date, builder.note,
                Type.RECEITA, builder.stats, builder.category);
        this.payer = builder.payer;
        this.revenueType = builder.revenueType;
    }



    public static class RevenueBuilder {
        private Long id;
        private String name;
        private BigDecimal value;
        private LocalDate date;
        private String note;
        private ItemStats stats;
        private Category category;
        private String payer;
        private RevenueType revenueType;

        public RevenueBuilder() {}

        public Revenue.RevenueBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public Revenue.RevenueBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public Revenue.RevenueBuilder withValue(BigDecimal value) {
            this.value = value;
            return this;
        }

        public Revenue.RevenueBuilder withDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Revenue.RevenueBuilder withNote(String note) {
            this.note = note;
            return this;
        }

        public Revenue.RevenueBuilder withStats(ItemStats stats) {
            this.stats = stats;
            return this;
        }

        public Revenue.RevenueBuilder withCategory(Category category) {
            this.category = category;
            return this;
        }

        public Revenue.RevenueBuilder withPayer(String payer) {
            this.payer = payer;
            return this;
        }

        public Revenue.RevenueBuilder withRevenueType(RevenueType revenueType) {
            this.revenueType = revenueType;
            return this;
        }

        public Revenue build() {
            return new Revenue(this);
        }
    }
}
