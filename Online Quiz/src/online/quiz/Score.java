
package online.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/scorecard.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
       
        JLabel  qno = new JLabel("   Thank You "+name+" for taking the exam");
        qno.setBounds(45,30,700,30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(qno);
        
         JLabel  score1 = new JLabel(" Your score is "+score);
        score1.setBounds(350,200,400,30);
        score1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(score1);
        
        JButton submit = new JButton("Retake Exam");
        submit.setBounds(390,270,120,40);
        //submit.setFont(new Font("Tahoma" , Font.PLAIN, 22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args){
        new Score("user",0);
    }   
}