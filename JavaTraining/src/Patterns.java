public class Patterns {
    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++){
            for (int j = 1; j<=6; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i <= 4; i++){
            for (int j = 1; j<=6; j++){
                if(i==1 || i==4 || j==1 || j==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i <= 5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 5; i > 0; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int rows = 4;
        for(int i = 1; i <= rows; i++){
            // print spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
