package Controller;


import View.Message;

import java.util.Scanner;

public class MenuController {
    //variables
    Message msg;
    boolean running;
    //constructor
    public MenuController(){
       this.msg = new Message();
       this.running = true;
    }

    public void runMenu(){
        while(running){

            msg.BookingSeatClassQuestion();
            alternatives(userInput());
        }

    }
    public int userInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public void alternatives(int choice){
        switch (choice){
            case 1:
                //View airports
                break;
            case 2:
                break;
            case 0:
                break;
            default:
                break;
        }
    }



}
