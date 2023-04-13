package expert.os.videos.demo;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
public class Book {
    @Identity

    private String isbn;

    private String title;


    private String description;
}
