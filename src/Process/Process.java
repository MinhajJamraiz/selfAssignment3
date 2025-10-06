package Process;

import java.util.ArrayList;
import java.util.List;
import IOperation.*;

public abstract class Process {
    protected String id;
    protected List<IOperation> operations;

    public Process(String id){
        this.id = id;
        this.operations = new ArrayList<>();
    }
    public abstract double processDuration();
    public abstract double processResources();

    public void addOperation(IOperation operation){
        operations.add(operation);
    }
    public String getId(){
        return id;
    }
}
