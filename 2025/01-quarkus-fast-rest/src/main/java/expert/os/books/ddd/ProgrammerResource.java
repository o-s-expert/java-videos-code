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
@Path("programmers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProgrammerResource {

    @Inject
    ProgrammerRepository repository;


    @GET
    @Path("{id}")
    @Produces("application/json")
    public Programmer get(@PathParam("id") Long id){
        Programmer programmer = repository.findById(id);
        if (programmer == null) {
            throw new WebApplicationException(404);
        }
        return programmer;
    }

    @GET
    @Produces("application/json")
    public Response list() {
        List<Programmer> people = repository.listAll(Sort.by("name"));
        return Response.ok(people).build();
    }

    @GET
    @Path("/count")
    public long count() {
        return repository.count();
    }

    @Transactional
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response add(Programmer programmer) {
        repository.persist(programmer);
        return Response.ok(programmer).build();
    }

    @Transactional
    @PUT
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response update(@PathParam("id") Long id, Programmer programmer) {
        if (repository.findById(id) == null) {
            repository.persist(programmer);
            return Response.status(204).build();
        }
        repository.persist(programmer);
        return Response.status(201).build();
    }

    @Transactional
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        if (!repository.deleteById(id)) {
            throw new WebApplicationException(404);
        }
    }
}
