package os.expert.demo.helidon;

public class Expedition {
    private String name;
    private String location;
    private String date;

    public Expedition(String name, String location, String date) {
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

    public String getDate() {
        return date;
    }
}
