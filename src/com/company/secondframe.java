package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class secondframe {
    public static void secondframe()
    {
        JFrame f;
        JPanel p1,p2;
        JLabel accno,pass1,pass2;
        JPasswordField pas1,pas2;
        JButton b;
        JTextField a1;

        f = new JFrame("CREATE NEW ACCOUNT");
        f.setSize(1400,800);

        p1 = new JPanel();
        p2 = new JPanel();
        p2.setBounds(0,0,1400,800);
        JFrame.setDefaultLookAndFeelDecorated(true);

        p1.setBounds(300,100,700,600);
        p1.setOpaque(true);
        p1.setBackground(new Color(0,0,0,70));

        accno = new JLabel("ACCOUNT NO");
        accno.setForeground(new Color(0,0,0));
        accno.setBounds(100,80,150,50);

        a1 = new JTextField(10);
        a1.setBounds(300,80,150,50);
        a1.setBackground(new Color(255,255,255,40));

        pass1 = new JLabel("ENTER PASSWORD");
        pass1.setForeground(new Color(0,0,0));
        pass1.setBounds(100,180,150,50);

        pas1 = new JPasswordField(10);
        pas1.setBounds(300,180,150,50);
        pas1.setBackground(new Color(255,255,255,40));

        pass2 = new JLabel("CONFIRM PASSWORD");
        pass2.setForeground(new Color(0,0,0));
        pass2.setBounds(100,280,150,50);

        pas2 = new JPasswordField(10);
        pas2.setBounds(300,280,150,50);
        pas2.setBackground(new Color(255,255,255,40));

        b = new JButton("SUBMIT");
        b.setForeground(Color.yellow);
        b.setBackground(Color.yellow);
        b.setOpaque(false);
        b.setFocusPainted(false);
        b.setBorderPainted(true);
        b.setContentAreaFilled(true);
        b.setBounds(280,380,80,50);

        try
        {
            BufferedImage i = ImageIO.read(new File("/home/ashwin/Downloads/swing/raysoranges11.jpg"));
            JLabel pic = new JLabel(new ImageIcon(i));
            pic.setBounds(0,0,1400,800);
            p2.add(pic);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent eve)
            {
                try
                {
                    String s1 = a1.getText();
                    String s2 = pas1.getPassword().toString();
                    String s3 = pas2.getPassword().toString();

                    Main m = new Main();
                    m.swing_without_panel();
                    f.dispose();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        });


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
        f.add(p2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

    }
}
