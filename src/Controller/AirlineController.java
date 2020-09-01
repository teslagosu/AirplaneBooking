package Controller;

import Model.Airline;
import View.Message;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineController {
    //variables
    Message msg = new Message();
    //arraylists
    private ArrayList<Airline> airlineList = new ArrayList<>();

    //Constructor
    public AirlineController(){
        this.createAirline();
    }
    //Creates an airline
    public void createAirline(){
        msg.AirlineNameOfAirLineQuestion();
        String airlineName = getAirLineName();
        Airline airline = new Airline();
        airline.setAirlineName(airlineName);
        airlineList.add(airline);
    }
    //takes an input from user for specified airline name
    public String getAirLineName(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    //returns list of airlines.
    public ArrayList<Airline> getAirlineList() {
        return airlineList;
    }
}
