package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String idUser;
    private List<LP> listProducts;
    public Order(String idUser){
        this.idUser=idUser;
        listProducts= new ArrayList<LP>();
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public List<LP> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<LP> listProducts) {
        this.listProducts = listProducts;
    }
}
