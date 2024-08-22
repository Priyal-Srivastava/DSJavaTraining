import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUI{

    public static void app(){
        JFrame frame = new JFrame("Hotel Reservation");
        frame.setLayout(null);
        frame.setSize(800,900);

        frame.getContentPane().setBackground(new Color(206,249,255));
        frame.setVisible(true);


        JLabel l1 = new JLabel("Reservation Form");
        l1.setBounds(280,70,250,30);
        l1.setFont(new Font("Calibri",Font.BOLD, 30));

        JLabel l2 = new JLabel("First Name");
        l2.setBounds(80,150,250,20);
        l2.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t1 = new JTextField();
        t1.setBounds(80,175,290,30);
        t1.setBorder(new LineBorder(Color.WHITE,2));
        t1.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l3 = new JLabel("Last Name");
        l3.setBounds(400,150,250,20);
        l3.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t2 = new JTextField();
        t2.setBounds(400,175,290,30);
        t2.setBorder(new LineBorder(Color.WHITE,2));
        t2.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l4 = new JLabel("Address Line 1");
        l4.setBounds(80,220,250,20);
        l4.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t3 = new JTextField();
        t3.setBounds(80,245,290,30);
        t3.setBorder(new LineBorder(Color.WHITE,2));
        t3.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l5 = new JLabel("Address Line 2");
        l5.setBounds(400,220,250,20);
        l5.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t4 = new JTextField();
        t4.setBounds(400,245,290,30);
        t4.setBorder(new LineBorder(Color.WHITE,2));
        t4.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel cb_l = new JLabel("State");
        cb_l.setBounds(80,290,200,30);
        cb_l.setFont(new Font("Calibri",Font.PLAIN, 20));
        String State[] = {"Choose state","Andhra Pradesh",
                "Arunachal Pradesh",
                "Assam",
                "Bihar",
                "Chhattisgarh",
                "Goa",
                "Gujarat",
                "Haryana",
                "Himachal Pradesh",
                "Jharkhand",
                "Karnataka",
                "Kerala",
                "Madhya Pradesh",
                "Maharashtra",
                "Manipur",
                "Meghalaya",
                "Mizoram",
                "Nagaland",
                "Odisha",
                "Punjab",
                "Rajasthan",
                "Sikkim",
                "Tamil Nadu",
                "Telangana",
                "Tripura",
                "Uttar Pradesh",
                "Uttarakhand",
                "West Bengal",
                "Andaman and Nicobar Islands",
                "Chandigarh",
                "Dadra and Nagar Haveli and Daman and Diu",
                "Delhi",
                "Jammu and Kashmir",
                "Ladakh",
                "Lakshadweep",
                "Puducherry" };
        JComboBox cb = new JComboBox<>(State);
        cb.setBounds(80,315,180,30);
        cb.setBackground(Color.WHITE);
        cb.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l6 = new JLabel("City");
        l6.setBounds(290,290,250,20);
        l6.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t5 = new JTextField();
        t5.setBounds(290,315,180,30);
        t5.setBorder(new LineBorder(Color.WHITE,2));
        t5.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l7 = new JLabel("Postal Code");
        l7.setBounds(500,290,250,20);
        l7.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t6 = new JTextField();
        t6.setBounds(500,315,190,30);
        t6.setBorder(new LineBorder(Color.WHITE,2));
        t6.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l8 = new JLabel("Contact no");
        l8.setBounds(80,360,250,20);
        l8.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t7 = new JTextField();
        t7.setBounds(80,385,290,30);
        t7.setBorder(new LineBorder(Color.WHITE,2));
        t7.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l9 = new JLabel("Email Address");
        l9.setBounds(400,360,250,20);
        l9.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField t8 = new JTextField();
        t8.setBounds(400,385,290,30);
        t8.setBorder(new LineBorder(Color.WHITE,2));
        t8.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l10 = new JLabel("No of Adults");
        l10.setBounds(290,430,250,20);
        l10.setFont(new Font("Calibri",Font.PLAIN, 20));

        String adlt[] = {"0","1","2","3","4","5","6","7","8","9"};
        JComboBox cb1 = new JComboBox<>(adlt);
        cb1.setBounds(290,455,180,30);
        cb1.setBackground(Color.WHITE);
        cb1.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l11 = new JLabel("No of Children");
        l11.setBounds(500,430,250,20);
        l11.setFont(new Font("Calibri",Font.PLAIN, 20));

        String child[] = {"0","1","2","3","4","5","6","7","8","9"};
        JComboBox cb2 = new JComboBox<>(child);
        cb2.setBounds(500,455,190,30);
        cb2.setBackground(Color.WHITE);
        cb2.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel l12 = new JLabel("Room Prefernce");
        l12.setBounds(80,430,250,20);
        l12.setFont(new Font("Calibri",Font.PLAIN, 20));

        String room[] = {"Room Type","Standard", "Deluxe", "Suite"};
        JComboBox roompref = new JComboBox<>(room);
        roompref.setBackground(Color.WHITE);
        roompref.setFont(new Font("Calibri",Font.PLAIN, 16));
        roompref.setBounds(80,455,190,30);


        JLabel cind = new JLabel("Check-in Date");
        cind.setBounds(80,500,140,30);
        cind.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField cind1 = new JTextField();
        cind1.setBounds(80,525,135,30);
        cind1.setBorder(new LineBorder(Color.WHITE,2));
        cind1.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel cint = new JLabel("Check-in Time");
        cint.setBounds(240,500,150,30);
        cint.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField cint1 = new JTextField();
        cint1.setBounds(240,525,135,30);
        cint1.setBorder(new LineBorder(Color.WHITE,2));
        cint1.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel cod = new JLabel("Check-out Date");
        cod.setBounds(395,500,150,30);
        cod.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField cod1 = new JTextField();
        cod1.setBounds(395,525,135,30);
        cod1.setBorder(new LineBorder(Color.WHITE,2));
        cod1.setFont(new Font("Calibri",Font.PLAIN, 16));

        JLabel cot = new JLabel("Check-out Time");
        cot.setBounds(550,500,150,30);
        cot.setFont(new Font("Calibri",Font.PLAIN, 20));

        JTextField cot1 = new JTextField();
        cot1.setBounds(550,525,140,30);
        cot1.setBorder(new LineBorder(Color.WHITE,2));
        cot1.setFont(new Font("Calibri",Font.PLAIN, 16));

        JButton submit = new JButton("Submit");
        submit.setBounds(280,600,100,30);
        submit.setBackground(Color.green);
        submit.setFont(new Font("Calibri",Font.PLAIN, 20));

        JButton reset = new JButton("Reset");
        reset.setBounds(400,600,100,30);
        reset.setBackground(Color.red);
        reset.setForeground(Color.WHITE);
        reset.setFont(new Font("Calibri",Font.PLAIN, 20));

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                var client = MongoClients.create("mongodb://localhost:27017/");

                var database = client.getDatabase("hotelBookingDB");

                // database.createCollection("reservation");

                var collection = database.getCollection("reservation");

                var document = new Document();
                Random random = new Random();
                document.append("reservationId",random.nextInt(999999));
                document.append("reservationStatus",true);
                document.append("firstName",t1.getText());
                document.append("lastName",t2.getText());
                document.append("addressLine1",t3.getText());
                document.append("addressLine2",t4.getText());
                document.append("state",cb.getSelectedItem().toString());
                document.append("city",t5.getText());
                document.append("postalCode",Integer.parseInt(t6.getText()));
                document.append("contactNo",t7.getText());
                document.append("emailAddress",t8.getText());
                document.append("roomPreference",roompref.getSelectedItem().toString());
                document.append("noofAdults",cb1.getSelectedItem().toString());
                document.append("noofChildren",cb2.getSelectedItem().toString());
                document.append("checkinDate",cind1.getText());
                document.append("checkinTime",cint1.getText());
                document.append("checkoutDate",cod1.getText());
                document.append("checkoutTime",cot1.getText());

                collection.insertOne(document);

            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                cind1.setText("");
                cint1.setText("");
                cod1.setText("");
                cot1.setText("");
                cb.setSelectedItem("Choose State");
                cb1.setSelectedItem("0");
                cb2.setSelectedItem("0");
                roompref.setSelectedItem("Room Type");
            }
        });

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t1);
        frame.add(t2);
        frame.add(l4);
        frame.add(l5);
        frame.add(t3);
        frame.add(t4);
        frame.add(l6);
        frame.add(l7);
        frame.add(t5);
        frame.add(t6);
        frame.add(cb);
        frame.add(cb_l);
        frame.add(l8);
        frame.add(l9);
        frame.add(t7);
        frame.add(t8);
        frame.add(l10);
        frame.add(l11);
        frame.add(l12);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(roompref);
        frame.add(cind);
        frame.add(cind1);
        frame.add(cod);
        frame.add(cod1);
        frame.add(cint);
        frame.add(cint1);
        frame.add(cot);
        frame.add(cot1);
        frame.add(submit);
        frame.add(reset);
    }
    public static void main(String[] args) {
        app();
    }
}


