import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Convert INR into USD");
        System.out.println("2 : Convert USD into INR");
        System.out.println("3 : Exit");
        int convert = sc.nextInt();
            switch (convert){
                case 1:
                    System.out.print("Enter the INR value : ");
                    float inr = sc.nextFloat();
                    System.out.println("Value in USD is " + ConvertintoUSD(inr) );
                    break;
                case 2:
                    System.out.print("Enter the USD value : ");
                    float usd = sc.nextFloat();
                    System.out.println("Value in INR is " + ConvertintoINR(usd) );
                    break;
                case 3:
                    sc.close();
                    break;
            }
    }
    public static float ConvertintoUSD(float inr){
        return (float) (inr / 83.72);
    }

    public static float ConvertintoINR(float usd){
        return (float) (usd * 83.72);
    }
}
