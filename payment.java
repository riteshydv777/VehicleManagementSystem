 
package CarBookingSystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class payment extends JFrame implements ActionListener{
    
    JRadioButton rcard,ronline ;
    JTextField tfnumber ;
    JButton pay , back ;
    
    payment(String username){
        setBounds(450,200,400,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null); 
        
        // header wala panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,850,45);
        add(p1);
        
        JLabel heading = new JLabel("Payment for Booking");
        heading.setBounds(30,5,350,35);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JLabel lbpayment = new JLabel("Payment");
        lbpayment.setBounds(40,50,150,40);
        add(lbpayment);
        
        JLabel lbpaywith = new JLabel("Pay With :");
        lbpaywith.setBounds(40,90,150,40);
        add(lbpaywith);
        
         // answer your payment.
        rcard = new JRadioButton("Credit Card");
        rcard.setBounds(40,125,150,25);
        rcard.setBackground(Color.WHITE);
        add(rcard);
        
        ronline = new JRadioButton("Net Banking");
        ronline.setBounds(40,150,150,25);
        ronline.setBackground(Color.WHITE);
        add(ronline);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rcard);
        bg.add(ronline);
        
        JLabel lbnumber = new JLabel(" Card Number :");
        lbnumber.setBounds(40,180,150,40);
        add(lbnumber);
        
         tfnumber = new JTextField();
        tfnumber.setBounds(40,220,150,25);
        add(tfnumber);
        
        JLabel lbamount = new JLabel(" Total Amount :");
        lbamount.setBounds(40,240,150,40);
        add(lbamount);
        
         pay = new JButton("Make Payment");
         pay.setBackground(Color.GRAY);
        pay.setForeground(Color.WHITE);
         pay.setBounds(40,280,130,25);
         //pay.addActionListener(this);
         add(pay);
         
         // button : back
         back = new JButton("Back");
         back.setBackground(Color.GRAY);
         back.setForeground(Color.WHITE);
         back.setBounds(180,280,100,25);
         //back.addActionListener(this);
         add(back);
        
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new Dashboard("");
        } 
    }
     
    public static void main(String[]args){
        new payment("");
    }
}
