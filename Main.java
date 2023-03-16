import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws Exception {


        HashSet<String> Workers = new HashSet<String>();
        Writer LocalWriter = new Writer();
        //LocalWriter.write("10, Vanya");
        Reader LocalReader = new Reader();
        LocalReader.readd();
        //ScannerClass scanClass = new ScannerClass();
        //scanClass.scan();
        CommandManager CM = new CommandManager();
        CM.generalCommands();

        /*Worker worker = scanClass.scanWorker();
        LocalReader.addWorker(worker);
        LocalWriter.write(worker.toString());
        LocalReader.getWorkers();*/
        //CollectionManager CoM = new CollectionManager();
        //CoM.readCollection();

        


    }
}