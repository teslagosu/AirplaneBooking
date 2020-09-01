package Model;

import Controller.AirportController;

import java.util.HashMap;

public class Airport {
    //variables
    private int gate;
    private String airportName;
    private Airline airline;


    //constructor when instanciating an Airport
    public Airport(){
        AirportController airportController = new AirportController();
        airline = new Airline();
        for (Airport a: airportController.getAirportList()) { //print out available airports
            System.out.println(a.airportName);
        }

    }

    //getters and setters
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
