package Resources;

public abstract class Resources {
    protected String name;

    public Resources(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double getCost();
}
