package Process;

import IOperation.*;
import Resources.*;

public class ManagementProcess extends Process{
    public ManagementProcess(String id){
        super(id);
    }

    public double processDuration(){
        return operations.stream().mapToDouble(IOperation::getDuration).sum();
    };
    public double processResources(){
        return operations.stream().flatMap(operation->operation.getResources().stream()).distinct().mapToDouble(Resources::getCost).sum();
    }
    
}
