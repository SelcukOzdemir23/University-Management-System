package university.management.system;


import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    public About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = il.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,300,200);
        add(image);

        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed by: Müşerref Selçuk Özdemir | WSTI");
        name.setBounds(70, 220, 600, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(name);
        
        JLabel rollno = new JLabel("Roll number: 1533146");
        rollno.setBounds(70, 280, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(rollno);
        
        JLabel contact = new JLabel("Contact : muserref.ozdemir@wsti.edu.pl");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        
        

        setVisible(true);

    }

    public static void main(String[] args) {
        new About();
    }
}
