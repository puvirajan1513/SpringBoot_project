package com.tnsif.SpringIocDi;

public class Product {
    private int pid;
    private String pname;
    private double price;

    // No-arg constructor
    public Product() {}

    // Constructor for p2 (pid, pname, price)
    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    // Constructor for cartBean (list of products)
    private java.util.List<Product> products;
    public Product(java.util.List<Product> products) {
        this.products = products;
    }

    // Getters and setters
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public java.util.List<Product> getProducts() {
        return products;
    }
    public void setProducts(java.util.List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        if (products != null) {
            return "Cart Products = " + products;
        }
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
    }
}
