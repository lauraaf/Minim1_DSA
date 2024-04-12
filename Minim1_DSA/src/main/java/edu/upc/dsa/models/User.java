package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    String id;
    String name;
    String surname;
    //private List<Order> userOrders;

    //static int lastId;

    public User() {
        //this.id = RandomUtils.getId();
    }

    public User(String id, String name, String surname) {
        this.id = id;
        this.setName(name);
        this.setSurname(surname);
        //this.userOrders = new ArrayList<Order>();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String title) {
        this.surname = surname;
    }

    /*public List<Order> getUserOrders() {
          return userOrders;
    }

    public void setUserOrders(List<Order> userOrders) {
        this.userOrders = userOrders;
    }*/

    @Override
    public String toString() {
        return "User [id="+id+", name=" + name +"]";
    }

}