 package CarBookingSystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
 
public class FirstPage extends JFrame implements ActionListener {
    
    JButton Ownerlogin , customberlogin   ;
    
    
     FirstPage(){
         setSize(900,400);
         setLocation(350,200);
         
         setLayout(null);
         
         getContentPane().setBackground(Color.CYAN);
         
         // left panel of frame.
         JPanel p1 = new JPanel();
         p1.setBackground(new Color(131,193,233));
         p1.setBounds(0,0,400,400);
         p1.setLayout(null);
         add(p1);
         
         // add image to left panel of frame.
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
         Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(100, 120, 200, 200);
         p1.add(image);
         
         // right panel of frame.
         JPanel p2 = new JPanel();
         p2.setLayout(null);
         p2.setBounds(400,30,450,300);
         add(p2);
         
         JLabel name = new JLabel("Vehicle Management System");
         name.setBounds(60, 15, 300, 25);
         name.setForeground(Color.BLUE); 
         name.setFont(new Font(name.getFont().getName(), Font.BOLD, name.getFont().getSize())); 
         name.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p2.add(name);
         
         // sign in to.
         JLabel signinto = new JLabel("Sign in to...");
         signinto.setBounds(60, 60, 130, 25);
         signinto.setForeground(Color.BLUE); 
         signinto.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p2.add(signinto);
         
         // owner login button
         Ownerlogin = new JButton("Owner Login");
         Ownerlogin.setBounds(60,  100, 160, 30);
         Ownerlogin.setBackground(new Color(133,193,233));
         Ownerlogin.setForeground(Color.WHITE);
         Ownerlogin.setBorder(new LineBorder(new Color(133,193,233)));
         Ownerlogin.addActionListener(this);
         p2.add(Ownerlogin);
         
         // customber login button
         customberlogin = new JButton("Customber Login");
         customberlogin.setBounds(60,  140, 170, 30);
         customberlogin.setBackground(new Color(133,193,233));
         customberlogin.setForeground(Color.WHITE);
         customberlogin.setBorder(new LineBorder(new Color(133,193,233)));
         customberlogin.addActionListener(this);
         p2.add(customberlogin);
         
         setVisible(true);
         
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Ownerlogin){ // logini button
            setVisible(false);
             //new login();
        } else if(ae.getSource() == customberlogin){ // signup button
            setVisible(false);
            new login();
        }  
    }
    public static void main(String[]args){
        new FirstPage();
    }
}
