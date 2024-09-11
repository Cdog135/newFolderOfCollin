
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class FileWriteExample {
    public static void main(String[] args) {
        String data = "Hello, World!";
        String fileName1 = "example.txt";
        String fileName2 = "example2.txt";
        String fileName3 = "example3.txt";
        String fileName4 = "example4.txt";
        String fileName5 = "example5.txt";

        // 1. Using FileWriter
        File hiddenFile = new File (".topSecret.txt");
        try (FileWriter writer = new FileWriter(hiddenFile)) {
            writer.write("collinPassword");
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        File hiddenFolder = new File (".superTopSecret");
        {
            //creates new hidden folder
            hiddenFolder.mkdir();
        }

        File regularFile = new File ("plainTextFile.txt");
        {
            FileWriter writer2 = new FileWriter (regularFile);
            writer2.writer ("top secret data");
            writer2.close();
        }
    }
       
        private static void printTotalFileSize(String... fileNames) 
        {
           System.out.println("Total size of all files: ...TBD... bytes");
        }

}


