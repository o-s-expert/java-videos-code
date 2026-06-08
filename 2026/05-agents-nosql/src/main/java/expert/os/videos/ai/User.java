package expert.os.videos.ai;

import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

import java.util.UUID;

@Entity
public class User {

    @Id
    private String id;

    @Column
    private String email;

    @Column
    private String name;

    User() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public static User of(String email, String name) {
        User user = new User();
        user.email = email;
        user.name = name;
        user.id = UUID.randomUUID().toString();
        return user;
    }
}
