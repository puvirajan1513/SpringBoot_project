package com.tnsif.SpringIocDi;

import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart(List<Product> products) {
        this.products = products;
    }

    public void displayCart() {
        System.out.println("Cart contains:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
