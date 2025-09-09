package com.cean.CeanFintech;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Expense extends Transactions {

    private final PaymentMethod paymentMethod;
    private final String beneficiary;

    private Expense(ExpenseBuilder builder) {
        super(builder.id, builder.name, builder.value, builder.date, builder.note,
                Type.DESPESA, builder.stats, builder.category);
        this.paymentMethod = builder.paymentMethod;
        this.beneficiary = builder.beneficiary;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public static class ExpenseBuilder {
        private Long id;
        private String name;
        private BigDecimal value;
        private LocalDate date;
        private String note;
        private ItemStats stats;
        private Category category;
        private PaymentMethod paymentMethod;
        private String beneficiary;

        public ExpenseBuilder() {}

        public ExpenseBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public ExpenseBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ExpenseBuilder withValue(BigDecimal value) {
            this.value = value;
            return this;
        }

        public ExpenseBuilder withDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public ExpenseBuilder withNote(String note) {
            this.note = note;
            return this;
        }

        public ExpenseBuilder withStats(ItemStats stats) {
            this.stats = stats;
            return this;
        }

        public ExpenseBuilder withCategory(Category category) {
            this.category = category;
            return this;
        }

        public ExpenseBuilder withPaymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public ExpenseBuilder withBeneficiary(String beneficiary) {
            this.beneficiary = beneficiary;
            return this;
        }

        public Expense build() {
            return new Expense(this);
        }
    }
}