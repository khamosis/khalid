package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class SuppControle implements ActionListener{

	SuppIHM zz;
	
				
			public void actionPerformed(ActionEvent e){
				SuppDao kk=new SuppDao();
				if(kk.supp(zz.CNE.getText())) {
					
					zz.msg.setText("Secces");
					//zz.setVisible(false);
					
					//SuppIHM ft=new SuppIHM();
					//s.msg.setForeground(Color.GREEN);
					
				}
				zz.setVisible(false);
				JOptionPane.showMessageDialog(null, "Data delete with success");
				SuppIHM ft=new SuppIHM();
//				else {
//					zz.msg.setText("Failed");
//					zz.msg.setForeground(Color.RED);
//				}
				
			}
		
	public SuppControle(SuppIHM tt) {
		zz=tt;
	}
}
	
	


	


