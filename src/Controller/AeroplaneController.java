package Controller;

import Model.Aeroplane;
import View.Message;

import java.util.ArrayList;
import java.util.Scanner;

public class AeroplaneController {
    Message msg = new Message();
    final int empty = 0;
    final int taken = 1;
    int[][] passengerSeats = new int[5][5];
    Aeroplane aeroplane;
    private ArrayList<Aeroplane> planeList = new ArrayList<>();

    public AeroplaneController(){
        this.createAeroplanes();
    }

    public String getAeroplaneName(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public int getAeroplaneQuantity(){

            Scanner input = new Scanner(System.in);
            return input.nextInt();

    }

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
    public void addAeroPlanesToAirPort(Aeroplane flight){
        planeList.add(flight);
    }

    public void showAeroPlanes(){
        for (Aeroplane plane:planeList) {
            System.out.println(plane.getPlaneName());
        }
    }


}
