import java.util.*;
public class PasswordGenerator
{
    public static void main(String[] args)
    {
        // Length of your password as I have choose
        // here to be 10
        int length = 10;
        System.out.println(Password());
    }

    // This our Password generating method
    // We have use static here, so that we not to
    // make any object for it
    static char[] Password()
    {

        int len = 10;
        System.out.println();
        System.out.println("------> PASSWORD GENERATOR <------");
        System.out.print("New Password : ");

        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password

        String values = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Using random method
        Random random = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(random.nextInt(values.length()));

        }
        return password;
    }
}