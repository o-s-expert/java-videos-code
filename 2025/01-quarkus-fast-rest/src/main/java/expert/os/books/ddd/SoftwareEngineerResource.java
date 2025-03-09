package expert.os.books.ddd;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@ApplicationScoped
@Path("software-engineers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SoftwareEngineerResource {



    @GET
    @Path("{id}")
    @Produces("application/json")
    public SoftwareEngineer get(@PathParam("id") Long id){
        SoftwareEngineer softwareEngineer = SoftwareEngineer.findById(id);
        if (softwareEngineer == null) {
            throw new WebApplicationException(404);
        }
        return softwareEngineer;
    }

    @GET
    @Produces("application/json")
    public Response list() {
        List<SoftwareEngineer> softwareEngineers = SoftwareEngineer.listAll(Sort.by("name"));
        return Response.ok(softwareEngineers).build();
    }

    @GET
    @Path("/count")
    public long count() {
        return SoftwareEngineer.count();
    }

    @Transactional
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response add(SoftwareEngineer softwareEngineer) {
        SoftwareEngineer.persist(softwareEngineer);
        return Response.ok(softwareEngineer).build();
    }

    @Transactional
    @PUT
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response update(@PathParam("id") Long id, SoftwareEngineer softwareEngineer) {
        if (SoftwareEngineer.findById(id) == null) {
            SoftwareEngineer.persist(softwareEngineer);
            return Response.status(204).build();
        }
        SoftwareEngineer.persist(softwareEngineer);
        return Response.status(201).build();
    }

    @Transactional
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        if (!SoftwareEngineer.deleteById(id)) {
            throw new WebApplicationException(404);
        }
    }
}
