package edu.upc.dsa.models;

public class LP {
    private int quantity;
    private int idProduct;
    public LP (int quantity, int idProduct){
        this.quantity = quantity;
        this.idProduct = idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}
