import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("My name is " + name + " and my age is " + age);

        String vote = (age>17) ? "Eligible" : "Not Eligible";
        System.out.println("You are " + vote + " to vote.");
    }
}

