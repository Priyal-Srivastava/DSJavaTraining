import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class OTPgenUsingJFrame {

    public static void otpgenerator() {

        // creating a frame
        JFrame f = new JFrame("OTP Generator");

        // creating a label
        JLabel l1;

        // creating a text field
        JTextField t1;

        // creating a button
        JButton b1;

        // setting the label , text field and button
        l1 = new JLabel("Your OTP is");
        l1.setBounds(150, 40, 100, 50);

        t1 = new JTextField("0");
        t1.setBounds(137, 100, 100, 20);

        b1 = new JButton("Generate OTP");
        b1.setBounds(127, 150, 120, 20);


        // Adding action listener to the button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Random random = new Random();
                int otp = random.nextInt(1000000);

                String str1 = String.valueOf(otp);

                t1.setText(str1);
            }
        });

        // adding all the items to the frame
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.CYAN);
    }

    // Driver code
    public static void main(String[] args) {

        // calling the function
        otpgenerator();
    }
}
