package com.example.transportationservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductDto {

    private String orderId;
    private String name;
/*    private String description;
    private @JsonProperty("last_update") LocalDateTime lastUpdate;*/
    private double price;
/*    private String categoryName;*/
    private int quantity;

    public ProductDto(){

    }

    public ProductDto(String orderId, String name, double price, int quantity) {
        this.orderId = orderId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /*    public ProductDto(String name, String description, LocalDateTime lastUpdate, double price, String categoryName, int quantity, String orderId) {
        this.name = name;
        this.description = description;
        this.lastUpdate = lastUpdate;
        this.price = price;
        this.categoryName = categoryName;
        this.quantity = quantity;
        this.orderId = orderId;
    }*/
}
