import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {


        AGV agv1 = new AGV("AGV1", 90, 1, 30, new AGVPosition(10, 20), 20, 10);
        AGV agv2 = new AGV("AGV2", 100, 0.5, 40, new AGVPosition(5, 15), 15, 7);

        IOperation operation1 = new IOperation("Operation1", "Added Items to the load", 20, Arrays.asList(agv1));
        IOperation operation2 = new IOperation("Operation2", "Moving Items", 20, Arrays.asList(agv1 , agv2));
        IOperation operation3 = new IOperation("Operation3", "Removing Items from the load", 15, Arrays.asList(agv2));


        IndustrialProcess process = new IndustrialProcess("Process1", Arrays.asList(operation1 , operation2 , operation3));
    
        process.getProcessInformation();
   
    }
}
