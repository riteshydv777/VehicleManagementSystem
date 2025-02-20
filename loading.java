 
package CarBookingSystem;

import javax.swing.*;
import java.awt.*;

public class loading extends JFrame implements Runnable{
    Thread t ;
    JProgressBar bar ;
    String username ;
    public void run(){
        try{
            for(int i = 1 ; i <= 101 ; i++){
                int max = bar.getMaximum() ;
                int value = bar.getValue();
                
                if(value < max) {
                    bar.setValue(bar.getValue() + 1);
                }else{
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    loading(String username){
        this.username = username ;
        t = new Thread(this) ;
        
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        
        // title
        JLabel text = new JLabel("Car Booking Application");
        text.setBounds(120,20,600,45);
        text.setForeground(Color.GRAY);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);
        
        // loading progressbar
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
         
        // loading pleas wait...
        JLabel loading = new JLabel("Loading, please wait...");
        loading.setBounds(225,130,400,45);
        loading.setForeground(Color.RED);
        
        loading.setFont(new Font("Raleway",Font.BOLD,16));
        add(loading);
        
        // username 
        JLabel lbusername = new JLabel("Welcome "+username);
        lbusername.setBounds(20,310,400,40);
        lbusername.setForeground(Color.RED);
        lbusername.setFont(new Font("Raleway",Font.BOLD,16));
        add(lbusername);
        
        t.start();
        setVisible(true);
    }
    public static void main(String[]args){
        new loading("");
    }
}
