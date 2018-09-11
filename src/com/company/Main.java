package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void swing_without_panel()
    {
        JFrame frame;
        frame=new JFrame("BANK");

        frame.setSize(1700,950);

        JLabel ACCNO,password;


        JTextField user;
        JPanel p1,p2,p3,p4;

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        JFrame.setDefaultLookAndFeelDecorated(true);


        p1.setBounds(600,200,500,400);
        p2.setBounds(700,650,300,70);
        p3.setBounds(0,0,1700,950);
        p4.setBounds(0,350,700,350);

        p1.setOpaque(true);
        p1.setBackground(new Color(0,0,0,75));
        p2.setBackground(new Color(0,0,0,75));
        p4.setBackground(Color.green);

        ACCNO = new JLabel("ACCOUNT NO");
        ACCNO.setForeground(new Color(0,0,0));
        ACCNO.setBounds(50,100,150,50);


        password = new JLabel("PASSWORD");
        password.setForeground(Color.black);
        password.setBounds(50,170,150,50);


        user = new JTextField(10);
        user.setBounds(200,100,150,50);
       // user.setBackground(new Color(255,255,255,0));


        JPasswordField pass = new JPasswordField(10);
        pass.setBounds(200,170,150,50);
        //pass.setBackground(new Color(255,255,255,0));


        JButton button = new JButton("GO");
        button.setForeground(Color.yellow);
        button.setBackground(Color.yellow);
        button.setOpaque(false);
        button.setFocusPainted(false);
        button.setBorderPainted(true);
        button.setContentAreaFilled(true);
        button.setBounds(150,250,100,30);

        button.addActionListener(e -> {
            try{
                String s1=user.getText();
                String s2=pass.getText();
                System.out.println(s2);
                if(s1.equals("1234") && s2.equals("1234"))
                {
                    thirdframe te2 = new thirdframe();
                    te2.thirdframe();
                    frame.dispose();
                }
                else
                {
                    String message = "INCORRECT ACCOUNT NO OR PASSWORD!!";
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            catch(Exception ae)
            {
                ae.printStackTrace();
            }

        });


        JButton b2 = new JButton("CREATE NEW ACCOUNT");
        b2.setForeground(Color.yellow);
        b2.setBackground(Color.yellow);
        b2.setOpaque(false);
        b2.setFocusPainted(false);
        b2.setBorderPainted(true);
        b2.setContentAreaFilled(true);
        b2.setBounds(10,20,280,30);


        b2.addActionListener(e -> {
            try
            {
                //String m = "CODE YET TO BE WRITTEN!";
                secondframe se2 = new secondframe();
                se2.secondframe();
                frame.dispose();
                //JOptionPane.showMessageDialog(null,m);
            }
            catch(Exception be)
            {
                be.printStackTrace();
            }
        });


        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);


        try{

            BufferedImage myPicture = ImageIO.read(new File("/home/ashwin/Downloads/pexels-photo-164497.jpeg"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            picLabel.setBounds(0,0,1700,950);
            p3.add(picLabel);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        p1.add(ACCNO);
        p1.add(user);
        p1.add(password);
        p1.add(pass);
        p1.add(button);
        p2.add(b2);
        //JPanel p = new JPanel();

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);


        //frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public static String generateHash(String pass)
    {   String hash;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            hash = md.digest(pass.getBytes(StandardCharsets.UTF_8)).toString();
        } catch (NoSuchAlgorithmException e) {
            hash = null;
            e.printStackTrace();
        }
        return hash;
    }

    public static void main(String[] args) {
	// write your code here

        swing_without_panel();
    }
}
//g.drawRoundRect(int x, int y, int width, int height, int xdiam, int ydiam)