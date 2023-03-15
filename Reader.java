import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Reader {
    public void readd(HashSet<Worker> Workers) throws Exception {

        FileInputStream fis = new FileInputStream("test.csv");
        BufferedInputStream bis = new BufferedInputStream(fis);
        InputStreamReader isr = new InputStreamReader(bis);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            String[] elements = line.split(";");

            // Обработка данных

            Worker holder = new Worker(-1,
                    "tempName",
                    new Coordinates(),
                    LocalDate.now(),
                    1,
                    LocalDateTime.now(),
                    null,
                    null,
                    new Organization()
                    );
            holder.setID(Integer.parseInt(elements[0].trim()));

            holder.setName(elements[1].trim());

            Workers.add(holder);
        }
        br.close();

    }


}
