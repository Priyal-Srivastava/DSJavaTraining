public class PrintNum {
    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        // for loop
        for(int i = 1; i<=10; i++){
            System.out.println(i);
            sum1 = sum1 + i;
        }
        System.out.println(sum1);

        // while loop
        int n = 10;
        while(n>0){
            System.out.println(n);
            sum2 = sum2 + n;
            n--;
        }
        System.out.println(sum2);

        // do while loop
        int i = 1;
        do{
            System.out.println(i);
            sum3 = sum3 + i;
            i++;
        }while (i<=10);
        System.out.println(sum3);
    }
}
