package com.cean.CeanFintech.model;

import com.cean.CeanFintech.enums.Type;

public class Category {
    private final Long id;
    private final String name;
    private final String description;
    private final String color;
    private final Type type;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    private Category(CategoryBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.color = builder.color;
        this.type = builder.type;
    }

    public static class CategoryBuilder {
        private Long id;
        private String name;
        private String description;
        private String color;
        private Type type;

        public CategoryBuilder () {}

        public CategoryBuilder withId(Long id){
            this.id = id;
            return this;
        }

        public CategoryBuilder withName(String name){
            this.name = name;
            return this;
        }

        public CategoryBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public CategoryBuilder withColor(String color){
            this.color = color;
            return this;
        }

        public CategoryBuilder withType(Type type){
            this.type = type;
            return this;
        }

        public Category build(){
            return new Category(this);
        }
    }

}
