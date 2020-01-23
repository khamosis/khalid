package Presentation;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Control.Adil;
import Control.AjoutIHM;
import Control.Ajoutdao;

public class Fenetre2 extends JFrame{
	public JTextField Nom;
	public JTextField Prenom;
	public JTextField Note;
	public JTextField Notemoyenne;
	public JLabel msg2;
	
	public Fenetre2() {
		
		
				setTitle("Gestion des etudiants");
	Icon l=new ImageIcon("/Users/redouane/Documents/add.png");	
	Nom= new JTextField();
	Prenom= new JTextField();
	Note= new JTextField();
	Notemoyenne= new JTextField();
	msg2=new JLabel();
	JLabel labNom=new JLabel("Nom");
	JLabel labPrenom=new JLabel("Prenom");
	JLabel labNote=new JLabel("Note");
	JLabel labNotemoyenne=new JLabel("Note Moyenne");
	JButton btAjout =new JButton(l);
//	JButton btModif =new JButton("Modifier");
//	JButton btSupp =new JButton("Supprimer");
	
	
	
	setBounds(50, 50, 650, 500);
	msg2.setBounds(270, 50, 250, 20);
	labNom.setBounds(50, 80, 250, 30);
	Nom.setBounds(305, 80, 250, 30);
	labPrenom.setBounds(50, 120, 250, 30);
	Prenom.setBounds(305, 120, 250, 30);
	labNote.setBounds(50, 160, 250, 30);
	Note.setBounds(305, 160, 250, 30);
	labNotemoyenne.setBounds(50, 200, 250, 30);
	Notemoyenne.setBounds(305, 200, 250, 30);
//	btModif.setBounds(50, 240, 100, 30);
	btAjout.setBounds(260, 260, 184, 42);
//	btSupp.setBounds(270, 240, 100, 30);
	
	
	getContentPane().setLayout(null);
	getContentPane().add(labNom);
	getContentPane().add(Nom);
	getContentPane().add(labPrenom);
	getContentPane().add(Prenom);
	getContentPane().add(labNote);
	getContentPane().add(Note);
	getContentPane().add(labNotemoyenne);
	getContentPane().add(Notemoyenne);
	getContentPane().add(btAjout);
//	getContentPane().add(btModif);
//	getContentPane().add(btSupp);
	btAjout.addActionListener(new AjoutIHM(this));
	getContentPane().add(msg2);
	
	
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}
}