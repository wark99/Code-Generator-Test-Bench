package com.example.inventorymanagement.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    private Integer inventoryID;
    private String inventoryName;
    private String inventoryLocation;
    private String ownerName;
}
