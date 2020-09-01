package Model;

public class SalesPerson {
    //variables
    private static int id;
    private String name;
    private String rank;
    private final int salesPersonId;

    //constructor creating a Sales Person
    public SalesPerson(int id, String name, String rank){
        salesPersonId = id++;
        this.setName(name);
        this.setRank(rank);
    }

    //Getters and setters for the variables
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        SalesPerson.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
