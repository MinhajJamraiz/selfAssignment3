import java.util.List;

public class IndustrialProcess {
    private List<IOperation> operations;
    private String id; 
    
    public IndustrialProcess (String id , List<IOperation> operations){
        this.id = id;
        this.operations = operations;
    }

    public int processDuration(){
        int totalDuration = 0;
        for(IOperation operation : operations){
            totalDuration = totalDuration + operation.getDuration();
        }
        return totalDuration;
    }

    public int processResources () {
        return operations.stream()    // to convert the list into a stream of operation.
                .flatMap(operation -> operation.getResources().stream())   // to convert each operation into a stream of AGVs   
                .distinct()   // get distinct agvs required for the process.
                .toList()  // change the stream back to the list
                .size();   // no of agvs required for the process
    }

    public void getProcessInformation (){
        System.out.println("Industrial Process ID : "+ id);
        System.out.println("Total Process Duration: "+processDuration()+ " minutes");
        System.out.println("Total AGVs required: "+ processResources());
    }
}
