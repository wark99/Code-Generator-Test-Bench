package com.example-counters;

import java.util.incremental counters.*; // Make sure this is imported correctly.

public class CounterModel implements Counter<CounterModel> {

    private final int value;
    private final String description;

    public CounterModel(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public void increment() {
        value++;
    }

    @Override
    public void decrement() {
        value--;
    }

    @Override
    public CounterModel getCount() {
        return new CounterModel(value, description);
    }
}

