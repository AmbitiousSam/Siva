import java.applet.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class User_Authentication extends Applet implements ActionListener  
{   int colornum;
    Button b1,b2;
    Label l1,l2;
    TextField t1,t2;
    String msg1="";
    String msg2="";
    public void init()
    {
        b1=new Button("Login");
        b1.addActionListener(this);
        b2=new Button("Clear");
        b2.addActionListener(this);
        l1=new Label("Username");
        t1=new TextField(20);
        l2=new Label("Password");
        t2=new TextField(20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            
            String username = t1.getText();
            String password = t2.getText();
            if(username.equals("user")&&(password.equals("user")))
            {
                colornum=1;                            
            }
            
            else
            {
                colornum=2;
            }
        }
        else
        {
            t1.setText(" ");
            t2.setText(" ");
        }        
    }
    public void paint(Graphics g)
    {
        switch(colornum)
        {
            case 1: g.setColor(Color.green);
                    msg1="Authentication Successful";
                    g.drawString(msg1, 300, 100);
                    break;
            case 2: g.setColor(Color.red);
                    msg2="Authenticarion Failed";
                    g.drawString(msg2, 300, 100);
                    break;
        }
    }
}
