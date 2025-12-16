import java.io.*;

public class StringWriterExample {
    public static void main(String[] args) throws Exception {
        StringWriter sw = new StringWriter();

        sw.write("Hello ");
        sw.write("Java");

        System.out.println(sw.toString());
    }
}
