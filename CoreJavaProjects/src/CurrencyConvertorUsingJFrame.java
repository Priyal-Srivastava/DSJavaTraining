import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConvertorUsingJFrame {
    public static void convertor(){

        JFrame frame = new JFrame("Currency Convertor");

        frame.setLayout(null);

        // to set the width and height of the frame
        frame.setSize(400,300);

        // to visible the frame on screen
        frame.setVisible(true);

        JLabel l1 = new JLabel("Value in INR :");
        l1.setBounds(50, 70, 100, 20);

        JTextField t1 = new JTextField();
        t1.setBounds(150,70,150,20);

        JLabel l2 = new JLabel("Value in USD :");
        l2.setBounds(50, 120, 100, 20);

        JTextField t2 = new JTextField();
        t2.setBounds(150,120,150,20);

        JButton b1 = new JButton("Convert");
        b1.setBounds(120,170,80,20);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().isEmpty()){
                    float usd = Float.parseFloat(t2.getText().toString());
                    float usdOutput = usd*83;
                    String str2 = String.valueOf(usdOutput);
                    t1.setText(str2);
                }
                else if (t2.getText().isEmpty()){
                    float inr = Float.parseFloat(t1.getText().toString());
                    float inrOutput = inr/83;
                    String str1 = String.valueOf(inrOutput);
                    t2.setText(str1);
                }
                else if (t1.getText().isEmpty() && t2.getText().isEmpty()) {
                    t1.setText("Enter Value");
                    t2.setText("Enter Value");
                }
                else{
                    float usd = Float.parseFloat(t2.getText().toString());
                    float inr = Float.parseFloat(t1.getText().toString());

                    float usdOutput = usd*83;
                    String str2 = String.valueOf(usdOutput);
                    t1.setText(str2);

                    float inrOutput = inr/83;
                    String str1 = String.valueOf(inrOutput);
                    t2.setText(str1);
                }
            }
        });

        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);

        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
    public static void main(String[] args) {

        // call the convertor() function
        convertor();
    }
}
