package OOPS;

import java.util.Scanner;

public class ClassObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trainer obj1 = new Trainer();
        Student obj2 = new Student();
        System.out.print("Enter your name : ");
        obj2.studentName = sc.nextLine();
        System.out.print("Enter your Technology : ");
        obj2.studentTechnology = sc.nextLine();
        System.out.println("My name is "+ obj2.studentName + " and your technology is " + obj2.studentTechnology);
    }
}
class Trainer{
    String trainerName;
    String trainerTechnology;
}
class Student{
    String studentName;
    String studentTechnology;
}