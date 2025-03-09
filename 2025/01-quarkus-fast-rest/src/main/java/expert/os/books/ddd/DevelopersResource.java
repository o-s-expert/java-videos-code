package expert.os.books.ddd;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface DevelopersResource extends PanacheEntityResource<Developer, Long> {
}