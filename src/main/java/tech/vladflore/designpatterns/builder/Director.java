package tech.vladflore.designpatterns.builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructCar() {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }

    public void constructCarManual() {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }

    public void constructCarWithoutGPS() {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
    }
}
