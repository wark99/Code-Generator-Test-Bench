package com.example.app.models;

public class ProductModelWithEnum implements Serializable {
    private final String name;
    private final double price;
    private final String description;
    private final EnumProductType productType;

    public ProductModelWithEnum(String name, double price, String description, EnumProductType productType) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.productType = productType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    // Getters for other fields are similar to the previous ProductModel
}

public enum EnumProductType {
    PRIMERS(1),
    SECONDERS(2),

    private final int value;

    enum ProductType implements Comparable<ProductType> {

        public enum ProductType.valueOf(String value) { ... }
        
        public static int valueOf(String value) { ... }

        public enum ProductType(value enumValue) {
            // Constructor handling
        }

        public int getValue() { return value; }
    }
}

