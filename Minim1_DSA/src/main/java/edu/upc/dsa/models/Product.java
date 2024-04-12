package edu.upc.dsa.models;

public class Product {
    private String idProduct;
    private String name;
    private String description;
    private double price;
    private int numSales;

    public Product(String idProduct, String name, double price){
        this.idProduct = idProduct;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
