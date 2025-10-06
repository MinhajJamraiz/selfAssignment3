package Resources;

public class MaterialResources extends NonHumanResources {
    private double materialCost;

    public double getCost(){
        return materialCost;
    }

    public MaterialResources(String name , double materialCost){
        super(name);
        this.materialCost = materialCost;
    }
}
