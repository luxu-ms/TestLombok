package com.example.demo;

import lombok.Data;

public @Data class Mountain {
    private final String name;
    private final double latitude, longtitude;
    private String country;
}
