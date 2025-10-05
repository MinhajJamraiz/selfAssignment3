import java.util.List;

public class IOperation {
    private String id;
    private String description;
    private int nominalTime;
    private List<AGV> resources;


    public IOperation (String id , String description , int nominalTime , List<AGV> resources){
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.resources = resources;
    }

    public void setData(String description, int nominalTime){
        this.description = description;
        this.nominalTime = nominalTime;
    }

    public String getData(){
        return "Operation Id: "+id+", Description: "+description+", Time: "+nominalTime+" mins";
    }

    public int getDuration(){
        return nominalTime;
    }

    public List<AGV> getResources(){
        return resources;
    }
}
