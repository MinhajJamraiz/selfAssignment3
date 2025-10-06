package IOperation;

import Resources.*;

public class HumanOperation extends IOperation {
    public HumanOperation(String id , String description , double nominalTime){
        super(id, description ,nominalTime);
    }

    public double getCost(){
        return resources.stream().mapToDouble(Resources::getCost).sum();
    }

    public double getDuration(){
        return nominalTime;
    }
}
