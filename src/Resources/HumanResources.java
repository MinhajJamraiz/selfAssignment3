package Resources;

public class HumanResources extends Resources {
    private double hourlyRate;
    private int hours;

    public double getCost(){
        return hourlyRate * hours;
    }

    public HumanResources(String name , double hourlyRate , int hours){
        super(name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }
    
}
