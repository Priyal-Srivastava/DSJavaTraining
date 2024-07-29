import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculatorUsingJFrame {
    public static void main(String[] args) {

        // to create a frame using swing in java
        JFrame frame = new JFrame("BMI Calculator");

        // to build the default layout
        frame.setLayout(null);

        // to set the width and height of the frame
        frame.setSize(500,370);

        // to visible the frame on screen
        frame.setVisible(true);

        // set the position and size of the labels, fields and button
        JLabel l1 = new JLabel("Enter your weight in kilograms :");
        l1.setBounds(50, 80, 200, 20);

        JTextField t1 = new JTextField();
        t1.setBounds(300,80,100,20);

        JLabel l2 = new JLabel("Enter your height in meters :");
        l2.setBounds(50, 140, 200, 20);

        JTextField t2 = new JTextField();
        t2.setBounds(300,140,100,20);

        JButton b1 = new JButton("Calculate BMI");
        b1.setBounds(180,200,120,20);

        JLabel l3 = new JLabel();
        l3.setBounds(180, 240, 120, 20);

        // to click the button to calculate BMI
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float weight = Float.parseFloat(t1.getText().toString());
                float height = Float.parseFloat(t2.getText().toString());

                float res = weight/(height*height);

                if (res < 18.5){
                    l3.setText("You are underweight");
                }
                else if (res > 18.5 && res < 24.9){
                    l3.setText("You are normal");
                }
                else if (res > 24.9 && res < 29.9){
                    l3.setText("You are overweight");
                }
                else{
                    l3.setText("You are highly overweight");
                }



            }
        });

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b1);
        frame.add(l3);

        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

    }
}
