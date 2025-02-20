
package CarBookingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username ;
    JComboBox comboid , comboid2 ;
    JButton addPersonalDetails , viewPersonalDetails , book ;
    JTextField tffromcity , tftocity , tfdate;
    Dashboard(String username){
        this.username = username ;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        
        // header wala panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,50));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        // add icon to panel
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Customer DashBoard");
        heading.setBounds(80,10,400,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        // left panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,50));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        // right panel
       
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(new Color(0,0,50));
        p3.setBounds(1260,65,300,900);
        add(p3);
        
        // middle
        JPanel p4 = new JPanel();
        p4.setLayout(null);
        p4.setBackground(new Color(0,0,50));
        p4.setBounds(380,150,800,400);
        add(p4);
        
        
        // buttons in left panel p2
        // button1 : add personal details
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,50));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60)); // my profile button towards left
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        // button2 : update personal details
        JButton updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,50));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30)); // my profile button towards left
        p2.add(updatePersonalDetails);
        // buttons3 : view personal details
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,50));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,50)); // my profile button towards left
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        setVisible(true);
        // buttons3 : delete personal details
        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,50));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40)); // my profile button towards left
        p2.add(deletePersonalDetails);
        // button4 : book cars
        JButton bookCars = new JButton("Booking");
        bookCars.setBounds(0,200,300,50);
        bookCars.setBackground(new Color(0,0,50));
        bookCars.setForeground(Color.WHITE);
        bookCars.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookCars.setMargin(new Insets(0,0,0,170)); // my profile button towards left
        p2.add(bookCars);
        
        // Buttons in right panel 
        // button1 : About us
        JButton aboutUs = new JButton("About Us");
        aboutUs.setBounds(0,0,300,50);
        aboutUs.setBackground(new Color(0,0,50));
        aboutUs.setForeground(Color.WHITE);
        aboutUs.setFont(new Font("Tahoma",Font.PLAIN,20));
        aboutUs.setMargin(new Insets(0,0,0,170));  
        p3.add(aboutUs);
        // button2 : settings
        JButton setting = new JButton("Settings");
        setting.setBounds(0,50,300,50);
        setting.setBackground(new Color(0,0,50));
        setting.setForeground(Color.WHITE);
        setting.setFont(new Font("Tahoma",Font.PLAIN,20));
        setting.setMargin(new Insets(0,0,0,170));  
        p3.add(setting);
        
        // button3 : extra services
        JButton service = new JButton("Services");
        service.setBounds(0,100,300,50);
        service.setBackground(new Color(0,0,50));
        service.setForeground(Color.WHITE);
        service.setFont(new Font("Tahoma",Font.PLAIN,20));
        service.setMargin(new Insets(0,0,0,170));  
        p3.add(service);
        
        // add image :
//        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/cardash.jpg"));
//        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT) ;
//        ImageIcon i6 = new ImageIcon(i5);
//        JLabel image = new JLabel(i6);
//        image.setBounds(300,65,960,900);
//        add(image);
        
        // add name to image
//        JLabel text = new JLabel("Vehicle Management System");
//        text.setBounds(95,35,1000,70);
//        text.setForeground(Color.WHITE);
//        text.setFont(new Font("Raleway",Font.PLAIN,55));
       // image.add(text);
       
        JLabel text = new JLabel("A.K Vehicle Agency...");
        text.setBounds(525,80,600,45);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);
        
         // add image to middle p4 panel
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/car2.jpg"));
         Image i5 = i4.getImage().getScaledInstance(200, 200 ,Image.SCALE_DEFAULT);
         ImageIcon i6 = new ImageIcon(i5);
         JLabel image = new JLabel(i6);
         image.setBounds(450,20,300,300);
         p4.add(image);
        
        // from city 
         JLabel lbfromcity = new JLabel("From City : ");
         lbfromcity.setBounds(30, 20, 120, 25);
         lbfromcity.setForeground(Color.WHITE);
         lbfromcity.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p4.add(lbfromcity);
        
         // 
         tffromcity = new JTextField();
        tffromcity.setBounds(150,20,150,25);
        p4.add(tffromcity);
        
         // To city 
         JLabel lbtocity = new JLabel("To City : ");
         lbtocity.setBounds(30,60, 120, 25);
         lbtocity.setForeground(Color.WHITE);
         lbtocity.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p4.add(lbtocity);
         
         tftocity = new JTextField();
         tftocity.setBounds(150,60,150,25);
         p4.add(tftocity);
         
         // booking date
         JLabel lbdate = new JLabel("Date : ");
         lbdate.setBounds(30,100, 120, 25);
         lbdate.setForeground(Color.WHITE);
         lbdate.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p4.add(lbdate);
         
         
         tfdate = new JTextField();
         tfdate.setBounds(150,100,150,25);
         p4.add(tfdate);
         
         
         // choose vehicles
         JLabel lbvehicle = new JLabel("Vehicles : ");
         lbvehicle.setBounds(30, 140, 120, 25);
         lbvehicle.setForeground(Color.WHITE);
         lbvehicle.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p4.add(lbvehicle);
         
        comboid = new JComboBox(new String[]{"Scorpio s11","Bolero","XUV 700","Verna","Creata"});
        comboid.setBounds(150,140,150,25);
        comboid.setBackground(Color.WHITE);
        p4.add(comboid);
        
        // number of vehicles
         JLabel lbnumber_of_vehicles = new JLabel("Count : ");
         lbnumber_of_vehicles.setBounds(30,180, 120, 25);
         lbnumber_of_vehicles.setForeground(Color.WHITE);
         lbnumber_of_vehicles.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p4.add(lbnumber_of_vehicles);
         
        comboid2 = new JComboBox(new String[]{"1","2","3","4"});
        comboid2.setBounds(150,180,50,25);
        comboid2.setBackground(Color.WHITE);
        p4.add(comboid2);
        
        // book button
        book = new JButton("Continue Booking");
        book.setBackground(Color.GRAY);
        book.setForeground(Color.WHITE);
        book.setBounds(30,230,140,25);
        book.addActionListener(this);
        p4.add(book);
        
         
        
         
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddPersonalDetail(username);
        }else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource() == book){
            // String username = tfusername.getText();
            String fromcity = tffromcity.getText();
            String tocity = tftocity.getText();
            String date = tfdate.getText();
            // String vehicle =getSelectedItem();
            
            String query = "insert into booking values('"+fromcity+"','"+tocity+"','"+date+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Booking confirmed !");
                // setVisible(false);
                // new payment(username);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
         new payment(username);
    }
    public static void main(String[]args){
        new Dashboard("");
    }
}
