
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
            FileWriter writer2;
            try {
                writer2 = new FileWriter (regularFile);
                writer2.write ("top secret data");
                writer2.close();
            } catch (IOException e) {
                e.printStackTrace();
            } //surrounded this with a try catch to handle ioexception
        }
        
        //printTotalFileSize("fileName1.txt", ".superTopSecret/fileName2.txt", ".superTopSecret/fileName3.txt");
        // ^ this code (if run inside the main) will test the printTotalFileSize method
    }

    //you don't have the print file size method so i added that too
    private static void printFileSize (String fileName) {
        File file = new File(fileName);
        System.out.println (file.length());
    }
       
    private static void printTotalFileSize(String... fileNames) {
        long totalSize = 0;
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if (file.exists()) {
                totalSize += file.length();
            }
        }
        System.out.println("Total size of all files: " + totalSize + " bytes");
    }

}


