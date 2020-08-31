package Controller;

import Model.Airline;
import View.Message;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineController {

    Message msg = new Message();
    private ArrayList<Airline> airlineList = new ArrayList<>();

    public AirlineController(){
        this.createAirline();
    }

    public void createAirline(){
        msg.AirlineNameOfAirLineQuestion();
        String airlineName = getAirLineName();
        Airline airline = new Airline();
        airline.setAirlineName(airlineName);
        airlineList.add(airline);
    }

    public String getAirLineName(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public ArrayList<Airline> getAirlineList() {
        return airlineList;
    }
}
