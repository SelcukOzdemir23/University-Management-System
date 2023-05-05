
package university.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash() {
        //background picture
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = il.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        
        //Jframe set
        int x = 1;
        for (int i = 2; i < 600; i+=4,x++) {
            setLocation(600-((i+x)/2),350-(i/2));
            setSize(i+3*x,i+x/2);
            
            //for waiting picture
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                
            }
        }
        
        
        
    }

    @Override
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            
            //Next Frame
            new Login();
        } catch (Exception e) {
        }
    }
    
    
    
    
    public static void main(String[] args) {
        new Splash();
    }
}
