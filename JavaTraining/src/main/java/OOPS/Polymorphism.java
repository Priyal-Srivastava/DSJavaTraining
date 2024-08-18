package OOPS;

public class Polymorphism {
    public static void main(String[] args) {

        // METHOD OVERLOADING

        // method calling for addition of integer
        System.out.println(add(5,6)); // 8

        // method calling for addition of float values
        System.out.println(add(5.6f,9.6f)); // 8

        // method calling for addition of double values
        System.out.println(add(5.6,96.5)); // 16

        // Total memory occupied = 32 bytes

    }

    private static double add(double a, double b) { // 8 + 8 = 16 bytes
        return (a+b);
    }

    private static float add(float a, float b) { // 4 + 4 = 8 bytes
        return (a+b);
    }

    public static int add(int a, int b){ // 4 + 4 = 8 bytes
        return (a+b);
    }
}
