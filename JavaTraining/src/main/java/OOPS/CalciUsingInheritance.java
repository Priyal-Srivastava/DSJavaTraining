package OOPS;

public class CalciUsingInheritance extends Calculator{
//    int c;
//    int d;
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,5);
        calculator.sub(10,5);
        calculator.mul(10,5);
        calculator.div(10,5);
    }
}

class Calculator{  // extends CalciUsingInheritance
    void add(int a, int b){
//        c=a;
//        d=b;
        System.out.println(a+b);
    }
    void sub(int a, int b){
//        c=a;
//        d=b;
        System.out.println(a-b);
    }
    void mul(int a, int b){
//        c=a;
//        d=b;
        System.out.println(a*b);
    }
    void div(int a, int b){
//        c=a;
//        d=b;
        System.out.println(a/b);
    }
}
