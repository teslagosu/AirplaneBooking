package View;

public class Message {

    public Message() {

    }

    private void print(String msg){ //print function for easier handling of print messages.
        System.out.println(msg);
    }
    /*
    *Main Messages
     */
    public void BookingSeatClassQuestion(){
        print("Please type 1 for First Class and Please type 2 for Economy.");
    }
    /*
    *Aeroplane Messages
     */
    public void AeroplaneQuantityQuestion(){
        print("How many aeroplanes do you want to create?");
    }

    public void AeroPlaneQuantityErrorMessage(){
        print("Something went wrong.. Please enter an integer(1,2,3,4..)");
    }

    public void getAeroPlaneErrorMessage() {
        print("Something went wrong.. try again");
    }

    public void AeroplaneEnterNameMessage(){
        print("Enter name of the plane please.");
    }

    /*
    *AIRLINE MESSAGES
     */

    public void AirlineNameOfAirLineQuestion(){
        print("What is the name of your airline?");
    }

    public void Airport_NameOfAirportQuestion() {
        print("Which of these airports is this?");
    }
}
