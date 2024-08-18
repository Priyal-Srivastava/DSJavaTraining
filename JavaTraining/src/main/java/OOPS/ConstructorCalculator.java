package OOPS;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ConstructorCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a  = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int b = scanner.nextInt();
        System.out.println("Enter the operation no : 1)Add 2)Subtract 3)Multiply 4)Divide");
        int op = scanner.nextInt();

        Calci calci = new Calci(a,b,op);
    }
}

class Calci{
    public Calci(int a, int b, int op) {
        this.a = a;
        this.b = b;
        this.c = op;
        switch (op){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wrong operation entered");
        }
    }
    int a,b,c;
}