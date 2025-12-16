import java.io.*;

public class StringReaderExample {
    public static void main(String[] args) throws Exception {
        String data = "Hello Java";
        StringReader sr = new StringReader(data);

        int ch;
        while ((ch = sr.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
