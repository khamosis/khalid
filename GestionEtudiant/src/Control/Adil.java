package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Entities.*;
import Presentation.Fenetre;
import Presentation.Fenetre2;

public class Adil implements ActionListener {
	
	Fenetre s;
	
	
	
	public void actionPerformed(ActionEvent e) {
		Authentificationdao dao=new Authentificationdao();
				
		if(dao.login(s.login.getText() , s.pw.getText())) {
			//s.msg.setText("Secces");
			s.setVisible(false);
			Fenetre2 ft=new Fenetre2();
			//s.msg.setForeground(Color.GREEN);
			
		}
		else {
			s.msg.setText("Failed");
			s.msg.setForeground(Color.RED);
		}
		
		
	}
	public Adil(Fenetre e) {
		s=e;
	}

	
	
	

}
