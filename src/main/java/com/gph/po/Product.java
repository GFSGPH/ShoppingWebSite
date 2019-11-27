package com.gph.po;

import lombok.Data;


@Data
public class Product {
    private int productId;

    private String productName;

    private int productSum;

    private double productPrice;

    private Status status;
}
