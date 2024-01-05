

package quiz.apllication;
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class score extends JFrame  implements  ActionListener{
    
    score(String name,int score)
    {
        setVisible(true); 
         setBounds(500,125,1000,850);
         getContentPane ().setBackground (Color.WHITE);
            setLayout(null);
            
            
             ImageIcon il = new ImageIcon (ClassLoader.getSystemResource ("icons/score.png"));
            JLabel image =new JLabel (il);
            add(image);
            image.setLocation(10,0);
            image.setSize(1000,450);
            
            JLabel heading =new JLabel("Thankyou  "+name+"  For Playing Quiz Mind");
            heading.setBounds(260, 500, 1000, 50);
            heading.setFont(new Font("Tahoma",Font.PLAIN,30));
            heading.setForeground(new Color( 30,144,254));
            add(heading);
            
            JLabel myscore =new JLabel("Your Score is  "+score);
            myscore.setBounds(400, 600, 1000, 50);
            myscore.setFont(new Font("Tahoma",Font.PLAIN,30));
            myscore.setForeground(new Color( 30,144,254));
            add(myscore);
        
            
            JButton playagin=new JButton("Play agin!!");
         playagin.setBounds (420, 700, 175, 65);
             playagin.setBackground (new Color (30, 144, 254));
              playagin.setFont(new Font("Tahoma",Font.PLAIN,24));
             playagin.setForeground(Color.WHITE);
             playagin.addActionListener(this);
             add(playagin);
        
    }
    public void actionPerformed (ActionEvent ae)
    {
         setVisible(false);
         new Login();
          }
    
     
    public static void main(String [] args)
    {
        new score("user",0);
    }
    
}
