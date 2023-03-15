import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Writer {

    public void write(HashSet<Worker> Workers) throws Exception{
        PrintWriter writer = new PrintWriter(new FileWriter("test.csv", false));
        for(Worker worker: Workers){
            writer.write(worker.getID()+";"+
                    worker.getName()+";"+
                    worker.getCoordinates().getX()+";"+
                    worker.getCoordinates().getY()+";"+
                    worker.getCreationDate()+ ";"+
                    worker.getSalary()+";"+
                    worker.getStartDate()+";"+
                    worker.getEndDate()+";"+
                    worker.getPosition()+";"+
                    worker.getOrganization()+"\n");
        }
        writer.close();
    }
}
