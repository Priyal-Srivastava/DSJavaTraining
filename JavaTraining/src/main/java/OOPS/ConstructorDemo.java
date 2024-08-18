package OOPS;

import java.util.Scanner;

public class ConstructorDemo {

//    public static void main(String[] args) {
//        MyClass myClass = new MyClass(5,6);
//        System.out.println("c :" + myClass.c);
//        System.out.println("d :" + myClass.d);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.next();
        String l = scanner.next();
        MyClass myClass = new MyClass(f,l);
    }
}
class MyClass{

    // parameter constructor
//    public MyClass(int a, int b) {
//        c = a;
//        this.d = b;
//        System.out.println(c+d);
//    }
//    int c , d;

    public MyClass(String a, String b) {
        this.f = a;
        this.l = b;
        System.out.println(f+" "+l);
    }
    String f,l;
}
