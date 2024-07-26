import java.util.Random;

public class OTPgenerator {
    public static void main(String[] args) {

        // generating otp using random package

        Random random = new Random();
        int otp = random.nextInt(1000000);
        System.out.println("Your otp is :" + otp);
    }
}
