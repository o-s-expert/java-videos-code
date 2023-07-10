package expert.os.examples;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Delivery {

    private UUID trackId;

    private LocalDate when;

    private String city;

    private String country;

    public Delivery(UUID trackId, LocalDate when, String city, String country) {
        this.trackId = trackId;
        this.when = when;
        this.city = city;
        this.country = country;
    }

    public Delivery() {
    }

    public UUID getTrackId() {
        return trackId;
    }

    public void setTrackId(UUID trackId) {
        this.trackId = trackId;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Delivery delivery = (Delivery) o;
        return Objects.equals(trackId, delivery.trackId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(trackId);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "trackId=" + trackId +
                ", when=" + when +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
