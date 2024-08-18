public class Patterns {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int r = 7;
        for (int i = 1; i <= r ; i++) {
            for (int j = i; j <= r; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= (i-1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < 5 ; i++) {
            for (int j = 1; j < 7 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 7; j++) {
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        int row = 4;
        for (int i = 1; i <= row; i++) {
            // print spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // print 1 to i
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }

            // print i-1 to 1
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}






