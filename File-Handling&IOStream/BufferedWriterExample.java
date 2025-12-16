import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        bw.write("Line 1");
        bw.newLine();
        bw.write("Line 2");

        bw.close();
    }
}
