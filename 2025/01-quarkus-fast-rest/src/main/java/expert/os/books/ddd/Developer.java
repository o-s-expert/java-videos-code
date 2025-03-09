package expert.os.books.ddd;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
public class Developer extends PanacheEntity {

    @Column
    public String name;

    @Column
    public String email;

    @Column
    public String language;
    @Column
    public String city;
}

