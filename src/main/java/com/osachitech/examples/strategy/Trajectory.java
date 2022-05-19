package com.osachitech.examples.strategy;

import javax.money.MonetaryAmount;
import java.time.Duration;
import java.util.Objects;

public class Trajectory {

    private final MonetaryAmount cost;

    private final Duration duration;

    private Trajectory(MonetaryAmount cost, Duration duration) {
        this.cost = cost;
        this.duration = duration;
    }

    public MonetaryAmount getCost() {
        return cost;
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trajectory that = (Trajectory) o;
        return Objects.equals(cost, that.cost) && Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, duration);
    }

    @Override
    public String toString() {
        return "Trajectory{" +
                "cost=" + cost +
                ", duration=" + duration +
                '}';
    }

    public static Trajectory of(MonetaryAmount cost, Duration duration) {
        Objects.requireNonNull(cost, "cost is required");
        Objects.requireNonNull(duration, "duration is required");

        return new Trajectory(cost, duration);
    }
}
