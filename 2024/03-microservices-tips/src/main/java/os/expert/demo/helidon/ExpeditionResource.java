package os.expert.demo.helidon;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.time.LocalDate;
import java.util.List;

@Path("/api/v1/expeditions")
public class ExpeditionResource {


    //pagination
    @GET
    public List<Expedition> list() {
        return List.of(
                new Expedition("Everest", "Nepal", LocalDate.parse("2022-03-01")),
                new Expedition("K2", "Pakistan", LocalDate.parse("2022-06-01")),
                new Expedition("Kangchenjunga", "Nepal", LocalDate.parse("2022-04-01")),
                new Expedition("Lhotse", "Nepal", LocalDate.parse("2022-05-01")),
                new Expedition("Makalu", "Nepal", LocalDate.parse("2022-07-01")),
                new Expedition("Cho Oyu", "Nepal", LocalDate.parse("2022-08-01")),
                new Expedition("Dhaulagiri", "Nepal", LocalDate.parse("2022-09-01")));
    }

    @GET
    @Path("/{id}")
    public Expedition get(@PathParam("id") String id) {

        return null;
    }

    @GET
    @Path("/my-expeditions")
    public List<Expedition> myExpeditions() {
        //
        return List.of();
    }
}