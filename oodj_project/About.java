/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package oodj_project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                                    About DSU          \n  "
                + "\nDayananda Sagar Institutions founded in the 60s by one such visionary,"
                + " late Sri Dayananda Sagar committed to take knowledge to the people,"
                + " transforms today’s students into responsible citizens and professional leaders of tomorrow. "
                + "Dayananda Sagar University created by an Act of the Karnataka State in 2014, "
                + "built on this adorable legacy and inspired by its own milestones, "
                + "meeting the needs of quality higher education in this part of the world. "
                + "THANK YOU.\n\n"
                ;

        TextArea t1 = new TextArea(s, 20, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("WELCOME TO DSU");
        add(l1);
        l1.setBounds(170, 10, 190, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
