package Model;

public class Customer {
    //variables
    private static int id = 1000; //id starts at 1000
    private String name;
    private String gender;
    private final int customerId;

    //constructor when creating a Customer
    public Customer(String name,String sex){
        this.customerId = id++;
        this.name = name;
        this.gender = gender;
    }


//getters and setters for variables
    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return gender;
    }
}
