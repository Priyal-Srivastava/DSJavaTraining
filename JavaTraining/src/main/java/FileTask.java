import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name :");
        String fileName = scanner.nextLine();

        File file = new File(fileName + ".csv");
        try {
            if (file.createNewFile()){
                System.out.println("New file is created with " + fileName +".txt name");
                System.out.println("Enter your friends name in the file :");
                String data = scanner.nextLine();

                // to write the file we have to use the class FileWriter
                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter(file,true);
                    fileWriter.write(data);
                    fileWriter.append(", ");
                    fileWriter.close();
                    System.out.println("Data successfully written");
                }
                catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println("The file already exists with same name");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
