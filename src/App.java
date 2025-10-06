import IOperation.*;
import Process.IndustrialProcess;
import Resources.*;


public class App {
    public static void main(String[] args) throws Exception {

        // Resource Initialization
        HumanResources hr = new HumanResources( "Worker 1" , 20, 8);
        AGV agv1 = new AGV("AGV-1",100,80,10,2,15,12 );
        MaterialResources mat = new MaterialResources("Boxes",20);
   

        // Operation Initialization
        TransportOperation transport = new TransportOperation("T1","Move the items", 3);
        transport.addResources(agv1);
        transport.addResources(mat);

        HumanOperation packing = new HumanOperation("H1", "Packing items", 4);
        packing.addResources(hr);


        // Process Initialization
        IndustrialProcess process = new IndustrialProcess("P1");
        process.addOperation(transport);
        process.addOperation(packing);


        // Final Simulation
        System.out.println("Process ID: "+ process.getId());
        System.out.println("Total Duration: "+ process.processDuration());
        System.out.println("Total Resource Cost: $"+ process.processResources());

    }
}
