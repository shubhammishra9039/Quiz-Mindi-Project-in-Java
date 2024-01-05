
package quiz.apllication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Rules extends JFrame implements ActionListener {
    String name;
    JButton Start,back;
    Rules(String name)
    {
        this.name=name;
        setSize(900,650);
            setLocation(600,250);
            setVisible (true);
              getContentPane ().setBackground (Color.WHITE);
            setLayout(null);
            
            JLabel heading= new JLabel ("Wellcome Rules "+ name+" !");
            add(heading);
            heading.setBounds(180,10,800,100 );
            heading.setFont (new Font ("Viner Hand ITC", Font. BOLD, 40));
            heading.setForeground (Color.BLUE);
            heading.setForeground(new Color( 30,144,254));
            
            JLabel rules= new JLabel ("");
            add(rules);
            rules.setBounds(30,75,800,500 );
            rules.setFont (new Font ("Tahoma", Font. PLAIN, 18));
            rules.setText(
                     "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di " + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
            );
            
            
    
            
            
             back= new JButton("Back");
            back.setBounds (300, 520, 120, 38);
             back.setBackground (new Color (30, 144, 254));
              back.setForeground(Color.WHITE);
              back.addActionListener(this);
            add(back);
            
            Start= new JButton("Start");
            Start.setBounds (460, 520, 120, 38);
             Start.setBackground (new Color (30, 144, 254));
             Start.setForeground(Color.WHITE);
             Start.addActionListener(this);
              
            add(Start);
            
                     
            
    }
    
    public void actionPerformed (ActionEvent ae)
             {
          if(ae.getSource()==Start)
          {
              
            setVisible(false);
            new Quiz(name);
            
            
          }
          else if(ae.getSource()==back)
          {
                  setVisible(false);
                  new Login();
                  
          }
          }

    public static void main(String [] args)
{
           new Rules("User");
           
    
}
    
}

