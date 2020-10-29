package tech.vladflore.designpatterns.builder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.setBuilder(carBuilder);
        director.constructCar();
        Car car = carBuilder.getCar();
        System.out.println(car);

        director.setBuilder(carManualBuilder);
        director.constructCarManual();
        Manual manual = carManualBuilder.getManual();
        System.out.println(manual);

        director.setBuilder(carBuilder);
        director.constructCarWithoutGPS();
        Car carWithoutGPS = carBuilder.getCar();
        System.out.println(carWithoutGPS);
    }
}
