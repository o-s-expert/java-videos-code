package expert.os.examples;

import java.time.Year;

public class BookBuilder {

    private String id;
    private String title;
    private Year release;
    private int edition = 1;

    public BookBuilder id(String id) {
        this.id = id;
        return this;
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder release(Year release) {
        this.release = release;
        return this;
    }

    public BookBuilder edition(int edition) {
        this.edition = edition;
        return this;
    }

    public Book builder() {
        return new Book(id, title, release, edition);
    }
}
