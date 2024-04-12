package edu.upc.dsa;

import edu.upc.dsa.models.Order;
import edu.upc.dsa.models.Product;

import java.util.List;

public interface ProductManager {
    public List<Product> productsByPrice();
    public List<Product> productsBySales();
    public void addOrder(Order order);
    public Order processOrder();
    public void addUser(String idUser, String name, String surname);
    public void addProduct(String idProduct, String name, double price);
    public Product getProduct(String idProducto);
    public List<Product> findAll();
    public int numUsers();
    public int numProducts();
    //public int numsales(String );

    public int size();
}
