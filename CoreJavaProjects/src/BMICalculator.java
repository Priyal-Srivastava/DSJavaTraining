import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("------> BMI CALCULATOR <------");
        System.out.println("Calculate your BMI");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilogram : ");
        float weight = sc.nextFloat();
        System.out.print("Enter your height in meters : ");
        float height = sc.nextFloat();
        float res = BMIindex(weight,height);
        System.out.println("Your BMI is " + res);
        if (res < 18.5){
            System.out.println("You are underweight");
        }
        else if (res < 24.9){
            System.out.println("You are normal");
        }
        else if (res < 29.9){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are highly overweight");
        }
    }
    public static float BMIindex(float weight, float height){
        return (weight/(height * height));
    }
}
