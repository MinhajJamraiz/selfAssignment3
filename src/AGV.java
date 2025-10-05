
public class AGV {
    private String id;
    private double batteryLoad;
    private double conuption;   // I think this is suppose to be consumption ? 
    private int chargingTime;
    private AGVPosition position;
    private float maxSpeed;
    private float actSpeed;


    public AGV(String id , double batteryLoad , double conuption , int chargingTime , AGVPosition position , float maxSpeed, float actSpeed){
        this.id = id;
        this.batteryLoad = batteryLoad;
        this.conuption = conuption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    } 

    public String getData(){
        return ("AGV ID:" + id + ", Battery: "+ batteryLoad + ", Consumption: "+ conuption+ ", Charging Time:" + chargingTime + ", Position: "+ position + ", Max Speed: "+ maxSpeed+ ", Act Speed: "+actSpeed);
    }

    public void setData(String id, double batteryLoad ,double conuption){
        this.id = id;
        this.batteryLoad = batteryLoad;
        this.conuption = conuption;
    }


}
