import java.io.*;
public class Writer {
    public void write(String text) throws Exception{
        PrintWriter writer = new PrintWriter(new FileWriter("test.csv", true));
        writer.write(text+"\n");
        writer.close();
    }
    public void clear() throws Exception{
        PrintWriter writer = new PrintWriter("test.csv");
        writer.write("");
        writer.close();
    }
}
