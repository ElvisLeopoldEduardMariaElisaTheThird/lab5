import java.io.*;
public class Writer {
    public void write(String text) throws Exception{
        PrintWriter writer = new PrintWriter(new FileWriter("test.csv", true));
        writer.write(text +",");
        writer.close();
    }
}
