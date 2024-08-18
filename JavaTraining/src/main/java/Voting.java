import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = sc.nextInt();
//        if(age>17){
//            System.out.println("Eligible");
//        }
//        else{
//            System.out.println("Not Eligible");
//        }

        String vote = (age>17) ? "Eligible" : "Not Eligible";
        System.out.println(vote);
    }
}
