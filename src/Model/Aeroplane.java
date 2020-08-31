package Model;

public class Aeroplane {
    private String planeName;


    /*
    *
    *Constructors
    *
     */
    public Aeroplane(String aeroplaneName){
        this.setPlaneName(aeroplaneName);
    }

    public Aeroplane(){

    }

    /*
    *
    *Getter and setters
    *
    */
    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }





}
