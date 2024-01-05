
package quiz.apllication;
import javax.swing. *;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame  implements  ActionListener {
    JButton rules,back;
    JTextField tfarme;
      Login () { 
          
           setSize(1200,550);
            setLocation(400,250);
            setVisible (true);
           
            getContentPane ().setBackground (Color.WHITE);
            setLayout(null);
            ImageIcon il = new ImageIcon (ClassLoader.getSystemResource ("icons/demo6.png"));
            JLabel image =new JLabel (il);
            add(image);
            image.setBounds(0,0,600,500);
            
            
            JLabel heading= new JLabel ("Quiz Minds");
            add(heading);
            heading.setBounds(750,50,400,75 );
            heading.setFont (new Font ("Style Script", Font. BOLD, 40));
            heading.setForeground (Color.BLUE);
            heading.setForeground(new Color( 30,144,254));
            
            
            
            JLabel name= new JLabel ("Enter Your Name");
            add(name);
            name.setBounds(775,115,500,75 );
            name.setFont (new Font ("Mongolian Baite", Font. BOLD, 18));
            name.setForeground (Color.BLUE);
            name.setForeground(new Color( 30,144,254));
            
             tfarme = new JTextField();
            tfarme.setBounds(750,200,230,30);
            tfarme.setFont(new Font("Mongolian Baite",Font.PLAIN,18));
            add(tfarme);
            
            rules= new JButton("Rules");
            rules.setBounds (720, 270, 120, 35);
             rules.setBackground (new Color (30, 144, 254));
             rules.setForeground(Color.WHITE);
             rules.addActionListener(this);
              
            add(rules);
            
             back= new JButton("Back");
            back.setBounds (900, 270, 120, 35);
             back.setBackground (new Color (30, 144, 254));
              back.setForeground(Color.WHITE);
              back.addActionListener(this);
            add(back);
             
               
               
           
            
            
      }
      
      public void actionPerformed (ActionEvent ae) {
          if(ae.getSource()==rules)
          {
              String name=tfarme.getText();
            setVisible(false);
            new Rules(name);
            
            
          }
          else if(ae.getSource()==back)
          {
                  setVisible(false);
                  
          }
          
      }
          
      
      public static void main(String[] args) {
            new Login();
}
}