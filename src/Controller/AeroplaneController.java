package Controller;

import Model.Aeroplane;
import View.Message;

import java.util.ArrayList;
import java.util.Scanner;

public class AeroplaneController {
    //variables
    Message msg = new Message();
    final int empty = 0;
    final int taken = 1;
    int[][] passengerSeats = new int[5][5];
    Aeroplane aeroplane;
    //arraylist
    private ArrayList<Aeroplane> planeList = new ArrayList<>();

    //Constructor
    public AeroplaneController(){
        this.createAeroplanes();
    }

    //takes input from user what the name of aeroplane is supposed to be
    public String getAeroplaneName(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    //gets input from user and returns quantity
    public int getAeroplaneQuantity(){

            Scanner input = new Scanner(System.in);
            return input.nextInt();

    }
    //creates aeroplanes
    public void createAeroplanes(){
        msg.AeroplaneQuantityQuestion();
        try{
            int quantity = getAeroplaneQuantity();
            while(quantity != 0){
                msg.AeroplaneEnterNameMessage();
                aeroplane = new Aeroplane(getAeroplaneName());
                addAeroPlanesToAirPort(aeroplane);
                quantity--;
            }
        }catch(Exception e){
            msg.AeroPlaneQuantityErrorMessage();
            createAeroplanes();
        }

    showAeroPlanes();
    }
    // adds a aeroplane to the aeroplane list
    public void addAeroPlanesToAirPort(Aeroplane flight){
        planeList.add(flight);
    }
    //prints out existing aeroplanes.
    public void showAeroPlanes(){
        for (Aeroplane plane:planeList) {
            System.out.println(plane.getPlaneName());
        }
    }


}
