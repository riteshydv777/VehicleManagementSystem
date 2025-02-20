 
package CarBookingSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ownerdashboard  extends JFrame{
    
    String username ;
    JButton viewPersonalDetails ;
    
    ownerdashboard(String username){
         this.username = username ;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        // header wala panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        // add icon to panel
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Owner DashBoard");
        heading.setBounds(80,10,400,40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        // left panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(131,193,233));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(new Color(131,193,233));
        p3.setBounds(1260,65,300,900);
        add(p3);
        
         // buttons3 : view personal details
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,0,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,50));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,50)); // my profile button towards left
        // viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
         
        
         setVisible(true);
    }
    public static void main(String[]args){
        new ownerdashboard("");
    }
}
