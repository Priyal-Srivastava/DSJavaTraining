package JDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ETgui{
     static JLabel l1, l2, l3 , l4;
     static JTextField t1, t2, t3, deleteid;
     static JButton b1, b2, b3, b4, b5;
     static Connection conn;
    public static void app(){

        createApp();

    }

    private static void createApp() {
        JFrame frame = new JFrame("Expense Tracker");
        frame.setVisible(true);
        frame.setSize(300,380);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(204,229,255));



        l1 = new JLabel("Total Expenses");
        l1.setBounds(95,40,150,25);

        l2 = new JLabel("Expense Type :");
        l2.setBounds(27, 90, 100, 25);

        l3 = new JLabel("Enter Income :");
        l3.setBounds(30,170,100,25);

        l4 = new JLabel("Amount :");
        l4.setBounds(65,130,100,25);

        t1 = new JTextField();
        t1.setBounds(130,90,100,30);

        t2 = new JTextField();
        t2.setBounds(130,130,100,30);

        t3 = new JTextField();
        t3.setBounds(130,170,100,30);

        b1 = new JButton("Add");
        b1.setBounds(20, 230,60,25);

        b2 = new JButton("List");
        b2.setBounds(200,230,60,25);

        b3 = new JButton("Delete");
        b3.setBounds(100,230,80,25);

        deleteid = new JTextField();
        deleteid.setBounds(90,80,110,25);
        deleteid.setVisible(false);

        b4 = new JButton("Update");
        b4.setBounds(50,280,80,25);

        b5 = new JButton("View");
        b5.setBounds(150,280,80,25);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                insertintoDB();

            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (b1.isVisible())
                {

                    //to hide the insert form
                    t1.setVisible(false);
                    l2.setVisible(false);
                    l3.setVisible(false);
                    l4.setVisible(false);
                    t2.setVisible(false);
                    t3.setVisible(false);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b4.setVisible(false);
                    l1.setText("     Enter the id");
                    deleteid.setVisible(true);

                }
                else {
                    String deleteQuery = "delete from expensetb where id = ?";
                    try {
                        PreparedStatement ps = conn.prepareStatement(deleteQuery);
                        ps.setInt(1, Integer.parseInt(deleteid.getText()));
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null,
                                "Record has been deleted");
                        t1.setVisible(true);
                        l2.setVisible(true);
                        l3.setVisible(true);
                        l4.setVisible(true);
                        t2.setVisible(true);
                        t3.setVisible(true);
                        b1.setVisible(true);
                        b2.setText("Total Expense");
                        deleteid.setVisible(false);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b1.isVisible())
                {

                    //to hide the insert form
                    t1.setVisible(false);
                    l2.setVisible(false);
                    l3.setVisible(false);
                    l4.setVisible(false);
                    t2.setVisible(false);
                    t3.setVisible(false);
                    b1.setVisible(false);
                    b2.setText("     Enter the id");
                    deleteid.setVisible(true);
                }
                else {
                    String deleteQuery = "Select * from expensetb where id = ?";
                    try {
                        PreparedStatement ps = conn.prepareStatement(deleteQuery);
                        ps.setInt(1, Integer.parseInt(b3.getText()));
                        ResultSet rs = ps.executeQuery();
                        while (rs.next())
                        {
                            System.out.print("ID: " + rs.getInt("id"));
                            System.out.print("Income amount: " + rs.getInt("income"));
                            System.out.print("Expense Type: " + rs.getString("expenseType"));
                            System.out.print("Expense Amount: " + rs.getInt("expenseAmount"));
                            t3.setText(String.valueOf(rs.getInt("income")));
                            t2.setText(String.valueOf(rs.getInt("expenseAmount")));
                            t1.setText(rs.getString("expenseType"));

                            b4.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String updateQuery = "update expensetb set income = ?, expenseType = ?, expenseAmount = ? where id = ?";
                                    try {
                                        PreparedStatement ps = conn.prepareStatement(updateQuery);
                                        ps.setInt(1, Integer.parseInt(t3.getText()));
                                        ps.setString(2, t1.getText());
                                        ps.setInt(3, Integer.parseInt(t2.getText()));
                                        ps.setInt(4, 31);
                                        ps.executeUpdate();
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }

                                }
                            });
                        }
                        JOptionPane.showMessageDialog(null,
                                "Record has been deleted");
                        t1.setVisible(true);
                        l2.setVisible(true);
                        l3.setVisible(true);
                        l4.setVisible(true);
                        t2.setVisible(true);
                        t3.setVisible(true);
                        b1.setVisible(true);
                        b2.setText("Total Expense");
                        deleteid.setVisible(false);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
        frame.add(l4);
        frame.add(t3);
        frame.add(b3);
        frame.add(deleteid);
        frame.add(b4);
        frame.add(b5);
    }

    private static void insertintoDB() {
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/expensedb", "root", "");
            System.out.println("Database connection established");
            String type = t1.getText();
            String amt = t2.getText();
            int i = Integer.parseInt(amt);
            String income = t3.getText();
            int inc = Integer.parseInt(income);
            String query = " insert into expensetb (income, expenseType, expenseAmount) values (?, ?, ?) ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, inc);
            stmt.setString(2, type);
            stmt.setInt(3,i);
            stmt.executeUpdate();

            // to pass the data submission to the user
            JOptionPane.showMessageDialog(null,"Data stored");

            // to clear the form
            clearForm();

        } catch (SQLException x) {
            throw new RuntimeException("DB not connected " + x);
        }
    }

    private static void clearForm() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

    public static void main(String[] args) {
         app();
    }
}
