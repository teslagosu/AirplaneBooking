package Model;

import Controller.AeroplaneController;

public class Airline {
    //variables
    private String airlineName;

    //constructor
    public Airline(){
        AeroplaneController aeroplaneController = new AeroplaneController();
    }
    //getters and setters
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}
