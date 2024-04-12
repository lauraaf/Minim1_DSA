package edu.upc.dsa;

import edu.upc.dsa.models.Order;
import edu.upc.dsa.models.Product;
import edu.upc.dsa.models.User;
import org.apache.log4j.Logger;

import java.util.*;

public class ProductManagerImpl implements ProductManager {
    private static ProductManager instance;
    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);
    protected List<Product> listProducts;
    LinkedList<User> listUsers;
    Queue<Order> listOrders;
    public ProductManagerImpl() {

        this.listOrders = new LinkedList<>();
        this.listProducts = new ArrayList<>();
        this.listUsers = new LinkedList<>();
    }

    public static ProductManager getInstance() {
        if (instance==null) instance = new ProductManagerImpl();
        return instance;
    }


    @Override
    public List<Product> productsByPrice() {
        return null;
    }

    @Override
    public List<Product> productsBySales() {
        return null;
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public Order processOrder() {
        return null;
    }

    @Override
    public void addUser(String idUser, String name, String surname) {
        logger.info("Comprovem que aquest usuari no existeix");
        if (listUsers.contains(idUser)) {
            logger.error("Aquets usuario ja existeix");
        }
        User user = new User(idUser, name, surname);
        listUsers.add(user);
        logger.info("S'ha afegit l'usuari correctament");

    }

    @Override
    public void addProduct(String idProduct, String name, double price) {
        logger.info("Comprovem que aquest producte no existeix");
        if (listProducts.contains(idProduct)) {
            logger.error("Aquets Producte ja existeix");
        }
        Product product = new Product(idProduct, name, price);
        listProducts.add(product);
        logger.info("S'ha afegit el producte correctament");
    }

    public Product getProduct(String idProducto){
        logger.info("getTrack("+idProducto+")");

        for (Product p: this.listProducts) {
            if (p.getIdProduct().equals(idProducto)) {
                logger.info("getTrack("+idProducto+"): "+p);

                return p;
            }
        }

        logger.warn("not found " + idProducto);
        return null;
    }
    public List<Product> findAll() {
        return this.listProducts;
    }
    /*@Override
    public Product getProduct(String idProducto) {
        boolean found = false;
        int i=0;
        Product product = null;
        while (!found && (i <listProducts.size())){
            product = listProducts.get(i);
            if(product.getIdProduct().equals(idProducto)){
                found = true;
            }
            i++;
        }
        return (found ? product : null);
    }*/

    @Override
    public int numUsers() {
        return 0;
    }

    @Override
    public int numProducts() {
        return 0;
    }
    public int size() {
        int ret = this.listUsers.size();
        logger.info("size " + ret);

        return ret;
    }

    /*public int size() {
        int ret = this.tracks.size();
        logger.info("size " + ret);

        return ret;
    }

    public User addTrack(User t) {
        logger.info("new Track " + t);

        this.tracks.add (t);
        logger.info("new Track added");
        return t;
    }

    public User addTrack(String title, String singer) {
        return this.addTrack(new User(title, singer));
    }

    public User getTrack(String id) {
        logger.info("getTrack("+id+")");

        for (User t: this.tracks) {
            if (t.getId().equals(id)) {
                logger.info("getTrack("+id+"): "+t);

                return t;
            }
        }

        logger.warn("not found " + id);
        return null;
    }

    public List<User> findAll() {
        return this.tracks;
    }

    @Override
    public void deleteTrack(String id) {

        User t = this.getTrack(id);
        if (t==null) {
            logger.warn("not found " + t);
        }
        else logger.info(t+" deleted ");

        this.tracks.remove(t);

    }

    @Override
    public User updateTrack(User p) {
        User t = this.getTrack(p.getId());

        if (t!=null) {
            logger.info(p+" rebut!!!! ");

            t.setName(p.getName());
            t.setSurname(p.getSurname());


            logger.info(t+" updated ");
        }
        else {
            logger.warn("not found "+p);
        }

        return t;
    }*/
}