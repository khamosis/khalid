package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Presentation.Fenetre2;

public class AjoutIHM implements ActionListener{
	
	Ajoutdao aj=new Ajoutdao();
	
	Fenetre2 a;

	public void actionPerformed(ActionEvent ee) {
		// TODO Auto-generated method stub
		
		aj.Ajoutetudiantdao(a.Nom.getText(),a.Prenom.getText(),a.Note.getText(),a.Notemoyenne.getText());
		a.msg2.setText("Enregistrement avec Succes !");
		a.setVisible(false);
		JOptionPane.showMessageDialog(null, "Data stored with success");
		
		Fenetre2 ft=new Fenetre2();
		
		
	}
	public AjoutIHM(Fenetre2 rr) {
		// TODO Auto-generated constructor stub
		a=rr;
	}

}
