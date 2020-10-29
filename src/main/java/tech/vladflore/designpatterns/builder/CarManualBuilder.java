package tech.vladflore.designpatterns.builder;

public class CarManualBuilder implements Builder {

    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats() {
        manual.setDocSeats("Seats documentation");
        System.out.println("Document seats");
    }

    @Override
    public void setEngine() {
        manual.setDocEngine("Engine documentation");
        System.out.println("Document engine");
    }

    @Override
    public void setTripComputer() {
        manual.setDoComputer("Computer documentation");
        System.out.println("Document trip computer");
    }

    @Override
    public void setGPS() {
        manual.setDocGPS("GPS documentation");
        System.out.println("Document GPS");
    }

    public Manual getManual() {
        return manual;
    }
}
