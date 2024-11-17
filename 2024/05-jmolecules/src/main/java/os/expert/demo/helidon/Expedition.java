package os.expert.demo.helidon;

import java.time.LocalDate;

public class Expedition {
    private String name;
    private String location;
    private LocalDate date;

    public Expedition(String name, String location, LocalDate date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }
}
