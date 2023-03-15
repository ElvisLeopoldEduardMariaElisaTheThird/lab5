import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        HashSet<Worker> Workers = new HashSet<>();

        /**Инициализация коллекции и запись в нее данных из файла. (С сохранением данных о коллекции для команды info)*/
        Reader LocalReader = new Reader();
        LocalReader.readd(Workers);

        String collectionType = "Worker";
        LocalDate initializationDate = LocalDate.now();
        int numberOfElements = Workers.size();


        CommandManager commandManager = new CommandManager();
        commandManager.info(collectionType, initializationDate, numberOfElements);




//        Worker temp = new Worker();
//        temp.setID(11);
//        temp.setName("Vino");
//        Workers.add(temp);
//
        Writer LocalWriter = new Writer();
        LocalWriter.write(Workers);

        //CollectionManager CoM = new CollectionManager();
        //CoM.readCollection();

        


    }
}