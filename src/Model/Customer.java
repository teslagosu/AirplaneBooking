package Model;

public class Customer {
    private static int id = 1000;
    private String name;
    private String sex;
    private final int customerId;


    public Customer(String name,String sex){
        this.customerId = id++;
        this.name = name;
        this.sex = sex;
    }



    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
