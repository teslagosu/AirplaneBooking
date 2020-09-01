package Model;

public class Country {
    //variables
    private String city;
    private String location; //Country

    //constructor when creating a instance of a country.
    public Country(String city, String location){
        this.city = city;
    }

    //getters and setters for variables
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
