package Model;

import Controller.AirportController;

import java.util.HashMap;

public class Airport {
    private int gate;
    private String airportName;
    private Airline airline;



    public Airport(){
        AirportController airportController = new AirportController();
        airline = new Airline();
        for (Airport a: airportController.getAirportList()) {
            System.out.println(a.airportName);
        }

    }

    public Airport(String airportName){
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }



    public void setGate(int gate) {
        this.gate = gate;
    }
}
