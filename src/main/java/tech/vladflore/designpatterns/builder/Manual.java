package tech.vladflore.designpatterns.builder;

public class Manual {
    private String docSeats;
    private String docEngine;
    private String doComputer;
    private String docGPS;

    public void setDocSeats(String docSeats) {
        this.docSeats = docSeats;
    }

    public void setDocEngine(String docEngine) {
        this.docEngine = docEngine;
    }

    public void setDoComputer(String doComputer) {
        this.doComputer = doComputer;
    }

    public void setDocGPS(String docGPS) {
        this.docGPS = docGPS;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "docSeats='" + docSeats + '\'' +
                ", docEngine='" + docEngine + '\'' +
                ", doComputer='" + doComputer + '\'' +
                ", docGPS='" + docGPS + '\'' +
                '}';
    }
}
