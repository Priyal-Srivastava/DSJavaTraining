package OOPS;

public class ExceptionalHandling {
    public static void main(String[] args) {

        // read the exception
        // how to control the exception

        // divide by zero exception
        try {
            System.out.println(100 / 0);
        } catch (Exception q) {
            System.out.println(q);
        }

        // null pointer or value exception
        String name = null;
        try {
            System.out.println(name.length());
        }catch (Exception q){
            System.out.println(q);
        }
    }
}
