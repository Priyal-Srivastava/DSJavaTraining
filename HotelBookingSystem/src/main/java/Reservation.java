import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Reservation {
    static MongoClient client1 = MongoClients.create("mongodb://localhost:27017/");

    static MongoDatabase database1 = client1.getDatabase("hotelBookingDB");

    // database.createCollection("reservation");

    static MongoCollection collection1 = database1.getCollection("reservation");

    static DBCursor cur = null;
    public static void main(String[] args) {
        bookingApp();
    }

    private static void bookingApp() {
        JFrame frame = new JFrame("Hotel Reservation");
        ImageIcon imageIcon = new ImageIcon("images\\Untitled design.png");
        frame.setContentPane(new JLabel(imageIcon));

        JLabel ll = new JLabel("Check Reservation Status");
        ll.setFont(new Font("Calibri",Font.BOLD, 26));
        ll.setForeground(new Color(0x2F1A02));
        ll.setBounds(850,240,300,40);
        frame.add(ll);

        JLabel ll1 = new JLabel("Enter your Reservation Id");
        ll1.setFont(new Font("Calibri",Font.PLAIN, 20));
        ll1.setForeground(new Color(0x2F1A02));
        ll1.setBounds(840,300,300,30);
        frame.add(ll1);

        JTextField tt1 = new JTextField();
        tt1.setFont(new Font("Calibri",Font.PLAIN, 18));
        tt1.setBackground(new Color(0xF5F1EF));
        tt1.setBorder(new LineBorder(Color.WHITE,2));
        tt1.setBounds(840,335,300,30);
        frame.add(tt1);

        JLabel ll2 = new JLabel("Enter your first name");
        ll2.setFont(new Font("Calibri",Font.PLAIN, 20));
        ll2.setForeground(new Color(0x2F1A02));
        ll2.setBounds(840,380,300,30);
        frame.add(ll2);

        JTextField tt2 = new JTextField();
        tt2.setFont(new Font("Calibri",Font.PLAIN, 18));
        tt2.setBackground(new Color(0xF5F1EF));
        tt2.setBorder(new LineBorder(Color.WHITE,2));
        tt2.setBounds(840,415,300,30);
        frame.add(tt2);

        JButton b1 = new JButton("Check Reservation");
        b1.setFont(new Font("Tahoma",Font.PLAIN, 18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(0x4D2B10));
        b1.setBorder(null);
        b1.setBounds(905,480,180,25);
        frame.add(b1);

        JLabel ll3 = new JLabel("New Reservation ?");
        ll3.setFont(new Font("Calibri",Font.PLAIN, 20));
        ll3.setForeground(new Color(0x2F1A02));
        ll3.setBounds(870,540,180,25);
        frame.getContentPane().add(ll3);

        JButton b2 = new JButton("Click Here");
        b2.setFont(new Font("Tahoma",Font.PLAIN, 18));
        b2.setForeground(Color.blue);
        b2.setBackground(Color.WHITE);
        b2.setBorder(null);
        b2.setBounds(1030,535,100,25);
        frame.add(b2);


        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.white);
        desktopPane.setBounds(790,200,400,410);
        frame.add(desktopPane);



        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int enteredId = Integer.parseInt(tt1.getText());
                String enteredName = tt2.getText();
                boolean status = true;
                FindIterable<Document> filteredResults = collection1.find(Filters.and(Filters.eq("reservationId", enteredId), Filters.eq("firstName", enteredName), Filters.eq("reservationStatus", status)));
                System.out.println(enteredId);
                System.out.println(enteredName);
                try (MongoCursor<Document> cursor = filteredResults.iterator()) {
                    if (cursor.hasNext() && status) {
                        JOptionPane.showMessageDialog(null, "Welcome");

                        Document document = cursor.next();

                        // Extract and store data into variables (use appropriate types based on your data)
//                        boolean status = document.getBoolean("reservationStatus");
                        String firstName = document.getString("firstName");
                        String lastName = document.getString("lastName");
                        String addressLine1 = document.getString("addressLine1");
                        String addressLine2 = document.getString("addressLine2");
                        String state = document.getString("state");
                        String city = document.getString("city");
                        int postalCode = document.getInteger("postalCode");
                        String contactNo = document.getString("contactNo");
                        String emailAddress = document.getString("emailAddress");
                        String roomPreference = document.getString("roomPreference");
                        String noofAdults = document.getString("noofAdults");
                        String noofChildren = document.getString("noofChildren");

                        String checkinDate = document.getString("checkinDate");
                        String checkinTime = document.getString("checkinTime");
                        String checkoutDate = document.getString("checkoutDate");
                        String checkoutTime = document.getString("checkoutTime");


                        desktopPane.setVisible(false);
                        ll.setVisible(false);
                        ll1.setVisible(false);
                        ll2.setVisible(false);
                        ll3.setVisible(false);
                        tt1.setVisible(false);
                        tt2.setVisible(false);
                        b1.setVisible(false);
                        b2.setVisible(false);

                        ImageIcon imageIcon1 = new ImageIcon("images\\bggggg.png");
                        frame.setContentPane(new JLabel(imageIcon1));

                        JLabel l1 = new JLabel("Reservation Form");
                        l1.setBounds(820,90,300,30);
                        l1.setFont(new Font("Tahoma",Font.BOLD, 26));

                        JLabel l2 = new JLabel("First Name");
                        l2.setBounds(630,160,250,20);
                        l2.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t1 = new JTextField();
                        t1.setBounds(630,185,290,30);
                        t1.setBorder(new LineBorder(Color.WHITE,2));
                        t1.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t1.setText(firstName);

                        JLabel l3 = new JLabel("Last Name");
                        l3.setBounds(950,160,250,20);
                        l3.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t2 = new JTextField();
                        t2.setBounds(950,185,290,30);
                        t2.setBorder(new LineBorder(Color.WHITE,2));
                        t2.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t2.setText(lastName);

                        JLabel l4 = new JLabel("Address Line 1");
                        l4.setBounds(630,230,250,20);
                        l4.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t3 = new JTextField();
                        t3.setBounds(630,255,290,30);
                        t3.setBorder(new LineBorder(Color.WHITE,2));
                        t3.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t3.setText(addressLine1);

                        JLabel l5 = new JLabel("Address Line 2");
                        l5.setBounds(950,230,250,20);
                        l5.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t4 = new JTextField();
                        t4.setBounds(950,255,290,30);
                        t4.setBorder(new LineBorder(Color.WHITE,2));
                        t4.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t4.setText(addressLine2);

                        JLabel cb_l = new JLabel("State");
                        cb_l.setBounds(630,300,200,30);
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
                        cb.setBounds(630,325,180,30);
                        cb.setBackground(Color.WHITE);
                        cb.setFont(new Font("Calibri",Font.PLAIN, 16));
                        cb.setSelectedItem(state);

                        JLabel l6 = new JLabel("City");
                        l6.setBounds(840,300,250,20);
                        l6.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t5 = new JTextField();
                        t5.setBounds(840,325,180,30);
                        t5.setBorder(new LineBorder(Color.WHITE,2));
                        t5.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t5.setText(city);

                        JLabel l7 = new JLabel("Postal Code");
                        l7.setBounds(1050,300,250,20);
                        l7.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t6 = new JTextField();
                        t6.setBounds(1050,325,190,30);
                        t6.setBorder(new LineBorder(Color.WHITE,2));
                        t6.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t6.setText(String.valueOf(postalCode));

                        JLabel l8 = new JLabel("Contact no");
                        l8.setBounds(630,370,250,20);
                        l8.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t7 = new JTextField();
                        t7.setBounds(630,395,290,30);
                        t7.setBorder(new LineBorder(Color.WHITE,2));
                        t7.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t7.setText(contactNo);

                        JLabel l9 = new JLabel("Email Address");
                        l9.setBounds(950,370,250,20);
                        l9.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField t8 = new JTextField();
                        t8.setBounds(950,395,290,30);
                        t8.setBorder(new LineBorder(Color.WHITE,2));
                        t8.setFont(new Font("Calibri",Font.PLAIN, 16));
                        t8.setText(emailAddress);

                        JLabel l10 = new JLabel("No of Adults");
                        l10.setBounds(840,440,250,20);
                        l10.setFont(new Font("Calibri",Font.PLAIN, 20));

                        String adlt[] = {"0","1","2","3","4","5","6","7","8","9"};
                        JComboBox cb1 = new JComboBox<>(adlt);
                        cb1.setBounds(840,465,180,30);
                        cb1.setBackground(Color.WHITE);
                        cb1.setFont(new Font("Calibri",Font.PLAIN, 16));
                        cb1.setSelectedItem(noofAdults);

                        JLabel l11 = new JLabel("No of Children");
                        l11.setBounds(1050,440,250,20);
                        l11.setFont(new Font("Calibri",Font.PLAIN, 20));

                        String child[] = {"0","1","2","3","4","5","6","7","8","9"};
                        JComboBox cb2 = new JComboBox<>(child);
                        cb2.setBounds(1050,465,190,30);
                        cb2.setBackground(Color.WHITE);
                        cb2.setFont(new Font("Calibri",Font.PLAIN, 16));
                        cb2.setSelectedItem(noofChildren);

                        JLabel l12 = new JLabel("Room Prefernce");
                        l12.setBounds(630,440,250,20);
                        l12.setFont(new Font("Calibri",Font.PLAIN, 20));

                        String room[] = {"Room Type","Standard", "Deluxe", "Suite"};
                        JComboBox roompref = new JComboBox<>(room);
                        roompref.setBackground(Color.WHITE);
                        roompref.setFont(new Font("Calibri",Font.PLAIN, 16));
                        roompref.setBounds(630,465,190,30);
                        roompref.setSelectedItem(roomPreference);


                        JLabel cind = new JLabel("Check-in Date");
                        cind.setBounds(630,510,140,30);
                        cind.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField cind1 = new JTextField();
                        cind1.setBounds(630,535,135,30);
                        cind1.setBorder(new LineBorder(Color.WHITE,2));
                        cind1.setFont(new Font("Calibri",Font.PLAIN, 16));
                        cind1.setText(checkinDate);

                        JLabel cint = new JLabel("Check-in Time");
                        cint.setBounds(790,510,150,30);
                        cint.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField cint1 = new JTextField();
                        cint1.setBounds(790,535,135,30);
                        cint1.setBorder(new LineBorder(Color.WHITE,2));
                        cint1.setFont(new Font("Calibri",Font.PLAIN, 16));
                        cint1.setText(checkinTime);

                        JLabel cod = new JLabel("Check-out Date");
                        cod.setBounds(945,510,150,30);
                        cod.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField cod1 = new JTextField();
                        cod1.setBounds(945,535,135,30);
                        cod1.setBorder(new LineBorder(Color.WHITE,2));
                        cod1.setFont(new Font("Calibri",Font.PLAIN, 16));
                        cod1.setText(checkoutDate);

                        JLabel cot = new JLabel("Check-out Time");
                        cot.setBounds(1100,510,150,30);
                        cot.setFont(new Font("Calibri",Font.PLAIN, 20));

                        JTextField cot1 = new JTextField();
                        cot1.setBounds(1100,535,140,30);
                        cot1.setBorder(new LineBorder(Color.WHITE,2));
                        cot1.setFont(new Font("Calibri",Font.PLAIN, 16));
                        cot1.setText(checkoutTime);

                        JButton update = new JButton("Update");
                        update.setBounds(830,610,100,30);
                        update.setBackground(new Color(0x009600));
                        update.setBorder(null);
                        update.setForeground(Color.WHITE);
                        update.setFont(new Font("Tahoma",Font.PLAIN, 18));

                        JButton cancel = new JButton("Cancel");
                        cancel.setBounds(950,610,100,30);
                        cancel.setBackground(new Color(0x0081A6));
                        cancel.setForeground(Color.WHITE);
                        cancel.setBorder(null);
                        cancel.setFont(new Font("Tahoma",Font.PLAIN, 18));

                        update.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Document document = new Document();
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

                                collection1.updateMany(new Document("reservationId",enteredId), new Document("$set",document));

                                JOptionPane.showMessageDialog(null, "Successfully Updated");
                            }
                        });

                        cancel.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                collection1.updateOne(new Document("reservationId",enteredId), new Document("$set",new Document("reservationStatus",false)));
                                JOptionPane.showMessageDialog(null, "Reservation cancelled");
                            }
                        });

                        frame.add(l1);frame.add(l2);frame.add(l3);frame.add(t1);
                        frame.add(t2);frame.add(l4);frame.add(l5);frame.add(t3);frame.add(t4);frame.add(l6);frame.add(l7);
                        frame.add(t5);frame.add(t6);frame.add(cb);frame.add(cb_l);frame.add(l8);frame.add(l9);
                        frame.add(t7);frame.add(t8);frame.add(l10);
                        frame.add(l11);frame.add(l12);
                        frame.add(cb1);frame.add(cb2);
                        frame.add(roompref);frame.add(cind);
                        frame.add(cind1);frame.add(cod);frame.add(cod1);frame.add(cint);
                        frame.add(cint1);frame.add(cot);frame.add(cot1);
                        frame.add(update); frame.add(cancel);

//                        JDesktopPane desktopPane1 = new JDesktopPane();
//                        desktopPane1.setBackground(new Color(255,255,255,120));
//                        desktopPane1.setBounds(570,50,740,635);
//                        frame.add(desktopPane1);

                    } else {
                        JOptionPane.showMessageDialog(null, "Reservation ID and Name combination not found.");
                    }
                }catch (Exception q){
                    throw new RuntimeException(q);
                }
            }
        });



        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                desktopPane.setVisible(false);
                ll.setVisible(false);
                ll1.setVisible(false);
                ll2.setVisible(false);
                ll3.setVisible(false);
                tt1.setVisible(false);
                tt2.setVisible(false);
                b1.setVisible(false);
                b2.setVisible(false);

                ImageIcon imageIcon1 = new ImageIcon("images\\bgggg.png");
                frame.setContentPane(new JLabel(imageIcon1));

                JLabel l1 = new JLabel("Reservation Form");
                l1.setBounds(820,90,300,30);
                l1.setFont(new Font("Tahoma",Font.BOLD, 26));

                JLabel l2 = new JLabel("First Name");
                l2.setBounds(630,160,250,20);
                l2.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t1 = new JTextField();
                t1.setBounds(630,185,290,30);

                t1.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l3 = new JLabel("Last Name");
                l3.setBounds(950,160,250,20);
                l3.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t2 = new JTextField();
                t2.setBounds(950,185,290,30);

                t2.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l4 = new JLabel("Address Line 1");
                l4.setBounds(630,230,250,20);
                l4.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t3 = new JTextField();
                t3.setBounds(630,255,290,30);

                t3.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l5 = new JLabel("Address Line 2");
                l5.setBounds(950,230,250,20);
                l5.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t4 = new JTextField();
                t4.setBounds(950,255,290,30);

                t4.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel cb_l = new JLabel("State");
                cb_l.setBounds(630,300,200,30);
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
                cb.setBounds(630,325,180,30);
                cb.setBackground(Color.WHITE);
                cb.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l6 = new JLabel("City");
                l6.setBounds(840,300,250,20);
                l6.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t5 = new JTextField();
                t5.setBounds(840,325,180,30);

                t5.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l7 = new JLabel("Postal Code");
                l7.setBounds(1050,300,250,20);
                l7.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t6 = new JTextField();
                t6.setBounds(1050,325,190,30);

                t6.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l8 = new JLabel("Contact no");
                l8.setBounds(630,370,250,20);
                l8.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t7 = new JTextField();
                t7.setBounds(630,395,290,30);

                t7.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l9 = new JLabel("Email Address");
                l9.setBounds(950,370,250,20);
                l9.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField t8 = new JTextField();
                t8.setBounds(950,395,290,30);

                t8.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l10 = new JLabel("No of Adults");
                l10.setBounds(840,440,250,20);
                l10.setFont(new Font("Calibri",Font.PLAIN, 20));

                String adlt[] = {"0","1","2","3","4","5","6","7","8","9"};
                JComboBox cb1 = new JComboBox<>(adlt);
                cb1.setBounds(840,465,180,30);
                cb1.setBackground(Color.WHITE);
                cb1.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l11 = new JLabel("No of Children");
                l11.setBounds(1050,440,250,20);
                l11.setFont(new Font("Calibri",Font.PLAIN, 20));

                String child[] = {"0","1","2","3","4","5","6","7","8","9"};
                JComboBox cb2 = new JComboBox<>(child);
                cb2.setBounds(1050,465,190,30);
                cb2.setBackground(Color.WHITE);
                cb2.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel l12 = new JLabel("Room Prefernce");
                l12.setBounds(630,440,250,20);
                l12.setFont(new Font("Calibri",Font.PLAIN, 20));

                String room[] = {"Room Type","Standard", "Deluxe", "Suite"};
                JComboBox roompref = new JComboBox<>(room);
                roompref.setBackground(Color.WHITE);
                roompref.setFont(new Font("Calibri",Font.PLAIN, 16));
                roompref.setBounds(630,465,190,30);


                JLabel cind = new JLabel("Check-in Date");
                cind.setBounds(630,510,140,30);
                cind.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField cind1 = new JTextField();
                cind1.setBounds(630,535,135,30);

                cind1.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel cint = new JLabel("Check-in Time");
                cint.setBounds(790,510,150,30);
                cint.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField cint1 = new JTextField();
                cint1.setBounds(790,535,135,30);

                cint1.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel cod = new JLabel("Check-out Date");
                cod.setBounds(945,510,150,30);
                cod.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField cod1 = new JTextField();
                cod1.setBounds(945,535,135,30);

                cod1.setFont(new Font("Calibri",Font.PLAIN, 16));

                JLabel cot = new JLabel("Check-out Time");
                cot.setBounds(1100,510,150,30);
                cot.setFont(new Font("Calibri",Font.PLAIN, 20));

                JTextField cot1 = new JTextField();
                cot1.setBounds(1100,535,140,30);

                cot1.setFont(new Font("Calibri",Font.PLAIN, 16));

                JButton submit = new JButton("Submit");
                submit.setBounds(830,610,100,30);
                submit.setBackground(new Color(0x009600));
                submit.setBorder(null);
                submit.setForeground(Color.WHITE);
                submit.setFont(new Font("Tahoma",Font.PLAIN, 18));

                JButton reset = new JButton("Reset");
                reset.setBounds(950,610,100,30);
                reset.setBackground(new Color(0x0081A6));
                reset.setForeground(Color.WHITE);
                reset.setBorder(null);
                reset.setFont(new Font("Tahoma",Font.PLAIN, 18));

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        var document1 = new Document();
                        Random random = new Random();
                        int i = random.nextInt(999999);
                        document1.append("reservationId",i);
                        document1.append("reservationStatus",true);
                        document1.append("firstName",t1.getText());
                        document1.append("lastName",t2.getText());
                        document1.append("addressLine1",t3.getText());
                        document1.append("addressLine2",t4.getText());
                        document1.append("state",cb.getSelectedItem().toString());
                        document1.append("city",t5.getText());
                        document1.append("postalCode",Integer.parseInt(t6.getText()));
                        document1.append("contactNo",t7.getText());
                        document1.append("emailAddress",t8.getText());
                        document1.append("roomPreference",roompref.getSelectedItem().toString());
                        document1.append("noofAdults",cb1.getSelectedItem().toString());
                        document1.append("noofChildren",cb2.getSelectedItem().toString());
                        document1.append("checkinDate",cind1.getText());
                        document1.append("checkinTime",cint1.getText());
                        document1.append("checkoutDate",cod1.getText());
                        document1.append("checkoutTime",cot1.getText());

                        collection1.insertOne(document1);

                        JOptionPane.showMessageDialog(null, "Your Reservation Id is " + i);
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

                frame.add(l1);frame.add(l2);frame.add(l3);frame.add(t1);
                frame.add(t2);frame.add(l4);frame.add(l5);frame.add(t3);frame.add(t4);frame.add(l6);frame.add(l7);
                frame.add(t5);frame.add(t6);frame.add(cb);frame.add(cb_l);frame.add(l8);frame.add(l9);
                frame.add(t7);frame.add(t8);frame.add(l10);
                frame.add(l11);frame.add(l12);
                frame.add(cb1);frame.add(cb2);
                frame.add(roompref);frame.add(cind);
                frame.add(cind1);frame.add(cod);frame.add(cod1);frame.add(cint);
                frame.add(cint1);frame.add(cot);frame.add(cot1);
                frame.add(submit); frame.add(reset);


            }
        });

        frame.pack();
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1366,768);
        frame.setVisible(true);

    }
}