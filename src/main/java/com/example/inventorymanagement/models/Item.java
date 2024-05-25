package com.example.inventorymanagement.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private Integer itemID;
    private String itemName;
    private String itemBarcode;
    private Double itemPrice;
    private Inventory inventory;
}
