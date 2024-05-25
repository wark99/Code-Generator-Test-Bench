package com.example.inventorymanagement.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {
    private Integer consumerID;
    private String consumerName;
    private String consumerBD;
    private String consumerLocation;
    private List<Item> items;
}
