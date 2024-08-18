import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // take the input from the user
        System.out.println("Enter the file name :");
        String fileName = scanner.nextLine();
        // file handling curd on file
        // create a file
        File myFile = new File(fileName + ".txt");
        //check if the file is already exists with same name or not
        try {
            if (myFile.createNewFile()){
                System.out.println("New file is created with "+fileName+".txt name");
            }
            else {
                System.out.println("The file already exists with same name");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // to write the data into the file
        System.out.println("Enter the message in your file :");
        String data = scanner.nextLine();

        // to write the file we have to use the class FileWriter
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(myFile);
            fileWriter.write(data);
            fileWriter.close();
            System.out.println("Data successfully written");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }


//        // to read the data from the file
//        File myObj = new File(fileName);
//        Scanner myReader = null;
//        try {
//            myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String readData = myReader.nextLine();
//
//                // to check if the string occur or not
//                if (readData.contains("java")){
//                    System.out.println("java keyword exists");
//                }
//                else {
//                    System.out.println("java keyword not exists");
//                }
//
//                // prints the data
//                System.out.println(readData);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//
//            // to update the file
//            System.out.println("Enter the update message in your file :");
//            String updatedata = scanner.nextLine();
//
//            try {
//                FileWriter updateWriter = new FileWriter(myFile, true);
//                updateWriter.append(" ");
//                updateWriter.append(updatedata);
//                updateWriter.close();
//                System.out.println("Data successfully written");
//            }
//            catch (IOException e){
//                throw new RuntimeException(e);
//            }
//
//
//        // to delete the file
//        File deleteObj = new File("welcome.txt");
//        if (deleteObj.delete()){
//            System.out.println("File is deleted");
//        }
//        else {
//            System.out.println("File not found");
//        }

    }
}
