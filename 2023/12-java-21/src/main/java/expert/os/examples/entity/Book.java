package expert.os.examples.entity;

public record Book(String id, String title, String author) {

    public Book setId(String newId) {
       return new Book(newId, title, author);
    }
}
