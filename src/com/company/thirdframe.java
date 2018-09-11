package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class thirdframe {

    public static void thirdframe()
    {
        JFrame f = new JFrame("WELCOME");
        JButton b1,b2,b3;
        b1= new JButton("TRANSFER FUNDS");
        b2= new JButton("ADD FUNDS");
        b3 = new JButton("WITHDRAW FUNDS");
        JPanel p1,p2,p3,p4;

        p1 = new JPanel();
        p2 = new JPanel();
        p3= new JPanel();
        p4= new JPanel();

        f.setSize(1400,800);
        p1.setBounds(0,0,1400,800);
        p2.setBounds(210,100,660,600);
        p3.setBounds(0,350,1400,100);
        p4.setBounds(0,200,1400,100);

        p1.setOpaque(true);
        p1.setBackground(new Color(0x5b507a));
        p2.setBackground(new Color(0xa393bf));
        p3.setBackground(new Color(0xe3e9f0));
        p4.setBackground(new Color(0x262b2d));

        b1.setBackground(new Color(0x2d3047));
        b1.setForeground(new Color(0xe0ca3c));

        b2.setBackground(new Color(0x2d3047));
        b2.setForeground(new Color(0xe0ca3c));

        b3.setBackground(new Color(0x2d3047));
        b3.setForeground(new Color(0xe0ca3c));

        b1.setBounds(200,60,250,50);
        b2.setBounds(200,160,250,50);
        b3.setBounds(200,260,250,50);

        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);

        f.add(p2);
        f.add(p4);
        f.add(p3);
        f.add(p1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main(String args[])
    {
        thirdframe();
    }

}

