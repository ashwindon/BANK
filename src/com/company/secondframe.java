package com.company;

import javax.swing.*;
import java.awt.*;

public class secondframe {
    public static void secondframe()
    {
        JFrame f;
        JPanel p1;
        JLabel accno,pass1,pass2;
        JPasswordField pas1,pas2;
        JButton b;
        JTextField a1;

        f = new JFrame("CREATE NEW ACCOUNT");
        f.setSize(1400,800);

        p1 = new JPanel();

        JFrame.setDefaultLookAndFeelDecorated(true);

        p1.setBounds(500,60,700,700);
        p1.setOpaque(true);
        p1.setBackground(new Color(0,0,0,200));

        accno = new JLabel("ACCOUNT NO");
        accno.setForeground(new Color(0,0,0));
        accno.setBounds(25,50,150,50);

        a1 = new JTextField(10);
        a1.setBounds(185,50,150,50);
        a1.setBackground(new Color(255,255,255,40));

        pass1 = new JLabel("ENTER PASSWORD");
        pass1.setForeground(new Color(0,0,0));
        pass1.setBounds(25,150,150,50);

        pas1 = new JPasswordField(10);
        pas1.setBounds(185,150,150,50);
        pas1.setBackground(new Color(255,255,255,40));

        pass2 = new JLabel("CONFIRM PASSWORD");
        pass2.setForeground(new Color(0,0,0));
        pass2.setBounds(25,200,150,50);

        pas2 = new JPasswordField(10);
        pas2.setBounds(185,200,150,50);
        pas2.setBackground(new Color(255,255,255,40));

        b = new JButton("SUBMIT");
        b.setForeground(Color.yellow);
        b.setBackground(Color.yellow);
        b.setOpaque(false);
        b.setFocusPainted(false);
        b.setBorderPainted(true);
        b.setContentAreaFilled(true);
        b.setBounds(320,250,100,50);


        /*b.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			String m = "CODE YET TO BE WRITTEN!";
        			JOptionPane.showMessageDialog(null,m);
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });*/


        p1.setLayout(null);

        p1.add(accno);
        p1.add(a1);
        p1.add(pass1);
        p1.add(pas1);
        p1.add(pass2);
        p1.add(pas2);
        p1.add(b);

        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

    }
}
