package tech.vladflore.designpatterns.builder;

public class Car {
    private int seats;
    private Engine engine;
    private TripComputer computer;
    private GPS gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setComputer(TripComputer computer) {
        this.computer = computer;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", computer=" + computer +
                ", gps=" + gps +
                '}';
    }
}
