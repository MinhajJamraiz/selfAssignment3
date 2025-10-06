package Resources;

public class HardwareResources extends NonHumanResources {
    private double maintainanceCost;

    public double getCost(){
        return maintainanceCost;
    }

    public HardwareResources(String name  , double maintainanceCost){
        super(name);
        this.maintainanceCost = maintainanceCost;
    }
    
}
