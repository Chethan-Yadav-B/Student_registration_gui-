package oodj_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class yadav extends JFrame implements ActionListener{
    JPanel jp= new JPanel();
    JLabel jl=new JLabel();
    private JButton sub;
    private JButton reset;

    
    public yadav(){
        setTitle("Dayananda Sagar University");
        setVisible(true);
        setBounds(100, 90, 600, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon(new ImageIcon("C:\\Users\\Chethan\\Pictures\\Screenshots\\dsu logo.jpeg"));
        jl.setBounds(400,90,50,50);
        jp.add(jl);
        add(jp);

        validate();
        
       
        sub = new JButton("About");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
        sub.setBounds(300,600,50,30);
		sub.addActionListener(this);
		jp.add(sub);
        add(jp);

		reset = new JButton("Register");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
        reset.setBounds(300,600,50,30);
		reset.addActionListener(this);
		jp.add(reset);
        add(jp);
        
		setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			 new About().setVisible(true);
			}
		

		else if (e.getSource() == reset) {
            new MyFrame().setVisible(true);
		}
	
    }


    public static void main (String[]args ){
        yadav cy = new yadav();
    }
}