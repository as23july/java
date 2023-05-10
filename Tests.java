import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.*;
import java.util.Scanner;

public class Tests {

    public static File createFile(String path){
        try {
            File file1 = new File(path);
            if(!file1.exists()){
                file1.createNewFile();
                System.out.println("File Created");
            }
            return file1;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    public static void writeToFile(File f1, boolean append){

        try(
            FileWriter filewrite = new FileWriter(f1,append);
            PrintWriter writer = new PrintWriter(filewrite);
            ){
                writer.println("Singh");
            
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        // try {
        //     FileWriter filewrite = new FileWriter(f1,append);
        //     PrintWriter writer = new PrintWriter(filewrite);
        
        //     writer.println("Aditya");

        //     writer.flush();
        //     writer.close();

        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
    }

    public static void main(String args[]) {

        File f1 = createFile("Folder/ss.txt");
        writeToFile(f1, true);

        try {
            Scanner sc = new Scanner(f1);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
