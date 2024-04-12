package edu.upc.dsa.services;


import edu.upc.dsa.ProductManager;
import edu.upc.dsa.ProductManagerImpl;
import edu.upc.dsa.models.Product;
import edu.upc.dsa.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/Products", description = "Endpoint to Product Service")
@Path("/ProductManager")
public class ProductsService {

    private ProductManager pm;

    public ProductsService() {
        this.pm = ProductManagerImpl.getInstance();
        if (pm.size()==0) {
            this.pm.addUser("Laura", "Fernandez","Garcia");

        }


    }
    @POST
    @ApiOperation(value = "Add new user", notes = "Add new user")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=User.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/Add user")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUsuario(User user){

        if (user.getId()==null || user.getName()==null || user.getSurname()==null)  return Response.status(500).entity(user).build();
        this.pm.addUser(user.getId(), user.getName(), user.getSurname());
        return Response.status(201).entity(user).build();
    }

    @GET
    @ApiOperation(value = "get Product", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Product.class, responseContainer="List"),
    })
    @Path("/get Product")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProduct(Product product) {

        List<Product> products = this.pm.findAll();

        GenericEntity<List<Product>> entity = new GenericEntity<List<Product>>(products) {};
        return Response.status(201).entity(entity).build()  ;

    }


    /*@POST
    @ApiOperation(value = "Add new product", notes = "Add new product")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Product.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addProduct(Product product){

        if (product.getIdProduct()==null || product.getName()==null || product.getPrice()== 0)  return Response.status(500).entity(product).build();
        this.pm.addProduct(product.getIdProduct(), product.getName(), product.getPrice());
        return Response.status(201).entity(product).build();
    }
   /* @GET
    @ApiOperation(value = "get all Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = User.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTracks() {

        List<User> tracks = this.tm.findAll();

        GenericEntity<List<User>> entity = new GenericEntity<List<User>>(tracks) {};
        return Response.status(201).entity(entity).build()  ;

    }

    @GET
    @ApiOperation(value = "get a Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = User.class),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrack(@PathParam("id") String id) {
        User t = this.tm.getTrack(id);
        if (t == null) return Response.status(404).build();
        else  return Response.status(201).entity(t).build();
    }

    @DELETE
    @ApiOperation(value = "delete a Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/{id}")
    public Response deleteTrack(@PathParam("id") String id) {
        User t = this.tm.getTrack(id);
        if (t == null) return Response.status(404).build();
        else this.tm.deleteTrack(id);
        return Response.status(201).build();
    }

    @PUT
    @ApiOperation(value = "update a Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/")
    public Response updateTrack(User track) {

        User t = this.tm.updateTrack(track);

        if (t == null) return Response.status(404).build();

        return Response.status(201).build();
    }



    @POST
    @ApiOperation(value = "create a new Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response= User.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTrack(User track) {

        if (track.getSinger()==null || track.getTitle()==null)  return Response.status(500).entity(track).build();
        this.tm.addTrack(track);
        return Response.status(201).entity(track).build();
    }*/

}