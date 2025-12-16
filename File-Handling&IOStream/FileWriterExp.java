import java.io.*;

public class FileWriterExp{
    public static void main(String []args){
        try{
            FileWriter fw= new FileWriter("output.txt");
            fw.write("Hello my name is Karan!");
            fw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}