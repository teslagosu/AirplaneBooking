package Controller;

import Model.Airport;
import Model.Country;

import java.util.ArrayList;

public class AirportController {

    //arraylists
    private ArrayList<Airport> airportList = new ArrayList<>();
    private ArrayList<String> destinations = new ArrayList<>();

    //Constructor
    public AirportController(){
        createListOfAirports();
        getdestinationList();
        System.out.println(destinations);
    }

    // creates a list of airports
    public void createListOfAirports(){
        Airport skelleftea = new Airport("Skellefteå SFT");
        skelleftea.getAirportName();
        Airport arlanda = new Airport("Arlanda ARL");
        Airport lulea = new Airport("Luleå LUL");
        airportList.add(skelleftea);
        airportList.add(arlanda);
        airportList.add(lulea);

        createDestinations(skelleftea,arlanda,34); // create a destination from skelleftea to arlanda

    }


    //create destinations
    public void createDestinations(Airport airportFrom,Airport airportTo ,int gate){
        String fromAirport = airportFrom.getAirportName();
        String toAirport = airportTo.getAirportName();
        destinations.add("from: "+fromAirport+" to: "+toAirport +" Gate: "+gate);
    }
    //getters and setters
    public ArrayList<Airport> getAirportList() { // returns list of airports
        return airportList;
    }

    public ArrayList<String> getdestinationList() { // returns list of airports
        return destinations;
    }
}
