import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // to read the data from the file
//        System.out.println("Enter the file name you want to read :");
//        String name = scanner.nextLine();
//        File myObj = new File(name+".txt");
//        Scanner myReader = null;
//        try {
//            myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String readData = myReader.nextLine();
//                // prints the data
//                System.out.println(readData);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//




                String source = "priyal.txt"; // Replace with your source file path
                String destination = "vaishnavi.txt"; // Replace with your destination file path

                try (FileInputStream inputStream = new FileInputStream(source);
                     FileOutputStream outputStream = new FileOutputStream(destination)) {

                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


    }
}
