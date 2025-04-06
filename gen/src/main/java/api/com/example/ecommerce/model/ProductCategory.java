package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "product_categories")
@JoinTable(
        name = "product_categories",
        joinColumns = {
                @JoinColumn(name = "product_id")
        },
        inverseJoinColumns = {
                @JoinColumn(name = "category_id")
        }
)
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "category_id")
    private Long categoryId;

    public ProductCategory() {
    }

    public ProductCategory(Long productId, Long categoryId) {
        this.productId = productId;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}

