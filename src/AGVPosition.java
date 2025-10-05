public class AGVPosition {
    private int x;
    private int y;

    public AGVPosition (int x , int y){
        this.x = x;
        this.y = y;
    }
    public String getPosition(){
        return "( "+x+" , "+y+" )";
    }
}
