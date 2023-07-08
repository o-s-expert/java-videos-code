package expert.os.examples;

import java.util.Objects;

public class DeliveryDTO {
    private String id;
    private String when;
    private String city;
    private String country;

    public DeliveryDTO(String id, String when, String city, String country) {
        this.id = id;
        this.when = when;
        this.city = city;
        this.country = country;
    }

    public DeliveryDTO() {
    }

    public String getId() {
        return id;
    }

    public String getWhen() {
        return when;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DeliveryDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.when, that.when) &&
                Objects.equals(this.city, that.city) &&
                Objects.equals(this.country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, when, city, country);
    }

    @Override
    public String toString() {
        return "DeliveryDTO[" +
                "id=" + id + ", " +
                "when=" + when + ", " +
                "city=" + city + ", " +
                "country=" + country + ']';
    }

}
