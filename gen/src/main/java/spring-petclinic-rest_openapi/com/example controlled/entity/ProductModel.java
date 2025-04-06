package com.example controlled.entity;

import org.springframework.stereotype ctrl;
import org.springframework.xml.bind.bind;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity(name = "Product")
class ProductModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Property
    private String productName;
        @Precondition(name = "productName should be at least 10 characters",
                      required = true,
                      argumentNameMapping = { productName -> "length >= 10" })

    @Property
    private String productDescription;
    
    @Property
    private Double price;

    @Property
    private Date createdAt;

    @Property
    private Integer stockLevel;
        @Precondition(name = "stockLevel should be at least 0",
                      required = true,
                      argumentNameMapping = { stockLevel -> ">= 0" })

    @Property
    private String category;
    
    @Annotation(Aspect boundary = AnnotationAspect boundary)
    public Map<String, Object> getMetadata() {
        return this;
    }
}

