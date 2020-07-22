package qua.hack.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import qua.hack.resource.ro.OrderCodeResponse;
import qua.hack.resource.service.OrderCodeService;

@Path("/order")
public class OrderCodeResource {

    @Inject
    OrderCodeService orderService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/secret/{id}")
    public OrderCodeResponse orderSecretCode(@PathParam String id) throws Exception {
        return orderService.getOrderSecretCode(id);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}