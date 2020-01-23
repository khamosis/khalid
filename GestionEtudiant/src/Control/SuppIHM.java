package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Presentation.Fenetre2;

public class SuppIHM extends JFrame{
	public JTextField CNE;
	public JLabel msg;
	
	public SuppIHM() {
		
		setTitle("Suppression des etudiants");
		CNE=new JTextField();
		JLabel labCNE=new JLabel("CNE étudiant");
		JButton btSupp=new JButton("Supprimer");
		msg=new JLabel();
		
		setBounds(50, 50, 650, 500);
		
		msg.setBounds(250, 50, 150, 30);
		labCNE.setBounds(150, 80, 150, 30);
		CNE.setBounds(305, 80, 250, 30);
		btSupp.setBounds(260, 260, 184, 42);
		
		getContentPane().setLayout(null);
		getContentPane().add(labCNE);
		getContentPane().add(CNE);
		getContentPane().add(btSupp);
		getContentPane().add(msg);
		btSupp.addActionListener(new SuppControle(this));
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
