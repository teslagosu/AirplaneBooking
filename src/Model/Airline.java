package Model;

import Controller.AeroplaneController;

public class Airline {
    private String airlineName;


    public Airline(){
        AeroplaneController aeroplaneController = new AeroplaneController();
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}
