package com.example.inventorymanagement.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provider {
    private Integer providerID;
    private String providerName;
    private String providerPNum;
    private String providerLocation;
    private List<Item> items;
}
