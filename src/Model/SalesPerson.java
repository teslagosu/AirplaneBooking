package Model;

public class SalesPerson {
    private static int id;
    private String name;
    private String rank;
    private final int salesPersonId;

    public SalesPerson(int id, String name, String rank){
        salesPersonId = id++;
        this.setName(name);
        this.setRank(rank);
    }

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
