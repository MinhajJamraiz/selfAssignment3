package IOperation;

import Resources.*;

public class TransportOperation extends IOperation {
    public TransportOperation(String id ,String description , double nominalTime ){
        super(id , description , nominalTime);
    }

    public double getDuration(){
        return nominalTime ;  
    }

    public double getCost(){
        return resources.stream().mapToDouble(Resources::getCost).sum();
    }
    
}
