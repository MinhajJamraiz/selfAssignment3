package Resources;


public class AGV extends HardwareResources{
    private double batteryLoad;
    private double conuption;   // I think this is suppose to be consumption ? 
    private int chargingTime;
    private AGVPosition position;
    private float maxSpeed;
    private float actSpeed;


    public AGV(String name ,double maintainanceCost, double batteryLoad , double conuption , int chargingTime  , float maxSpeed, float actSpeed){
        super(name , maintainanceCost);
        this.batteryLoad = batteryLoad;
        this.conuption = conuption;
        this.chargingTime = chargingTime;
        this.position = new AGVPosition(0, 0);
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    } 

    public double getCost(){
        return super.getCost() + (conuption * 0.5);
    }




}
