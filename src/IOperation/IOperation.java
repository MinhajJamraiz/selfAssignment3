package IOperation;

import java.util.ArrayList;
import java.util.List;
import Resources.*;

public abstract class IOperation {
    protected String id;
    protected String description;
    protected double nominalTime;
    protected List<Resources> resources;

    public void addResources(Resources resource){
        resources.add(resource);
    }

    public List<Resources> getResources(){
        return resources;
    }

    public IOperation(String id , String description , double nominalTime ){
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.resources = new ArrayList<>();
    }
    public abstract double getDuration();
    public abstract double getCost();

}
