import java.io.*;
import java.util.HashSet;
public class Reader {
    HashSet<Worker> Workers = new HashSet<Worker>();
    public void readd() throws Exception {

        FileInputStream fis = new FileInputStream("test.csv");
        BufferedInputStream bis = new BufferedInputStream(fis);
        InputStreamReader isr = new InputStreamReader(bis);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            String[] elements = line.split(",");
            // Обработка данных
            Worker holder = new Worker();
            holder.setID(Integer.parseInt(elements[0]));
            holder.setName(elements[1]);
            Workers.add(holder);
        }
        br.close();
        for (Worker work: Workers){
            System.out.print(work.getID());
            System.out.println(work.getName());
        }
    }


}
