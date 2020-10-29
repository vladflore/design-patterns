package tech.vladflore.designpatterns.builder;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats() {
        car.setSeats(5);
        System.out.println("Set seats");
    }

    @Override
    public void setEngine() {
        car.setEngine(new Engine());
        System.out.println("Set engine");
    }

    @Override
    public void setTripComputer() {
        car.setComputer(new TripComputer());
        System.out.println("Set trip computer");
    }

    @Override
    public void setGPS() {
        car.setGps(new GPS());
        System.out.println("Set GPS");
    }

    public Car getCar() {
        return car;
    }
}
