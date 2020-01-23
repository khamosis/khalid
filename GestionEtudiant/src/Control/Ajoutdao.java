package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ajoutdao {
	// Creer une cnx (lien) vers une base de donnees
	Connection cnx;
	// Pour envoyer et executer des requetes sql
	Statement st;
	// Récuperation des résultat
	ResultSet rsq;

	
	public Ajoutdao() {
		
	
		String chaine="jdbc:mysql://localhost:3306/gestionetudiant?verifyServerCertificate=false&useSSL=true";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Chargement avec succès ! ");
		}catch(ClassNotFoundException e1) {
			System.out.println("Problème Driver ! ");
			e1.printStackTrace();
		}
		try {
		cnx= DriverManager.getConnection(chaine,"root","azertyui");
		System.out.println("Connexion avec succès ! ");
		}catch(SQLException e1) {
			System.out.println("Problème de connexion ! ");
			e1.printStackTrace();
		}
	}
	
	public boolean Ajoutetudiantdao(String Nom,String Prenom, String Note,String Notemoyenne) {
		
		
		
		try {
			st= cnx.createStatement();
			//int i = st.executeUpdate("insert into etudiant(NOM,PRENOM,NOTE,NOTEMOYENNE) values ('"+e.nom+"','"+e.prenom+"''"+e.note+"')");
			int i = st.executeUpdate("insert into gestion (NOM,PRENOM,NOTE,NOTEMOYENNE) values ('"+Nom+"','"+Prenom+"','"+Note+"','"+Notemoyenne+"')");
			System.out.println("Enregistrement avec succès "+ i);




		} catch (SQLException e1) {
			
			System.out.println("Poblème d'enregistrement ");
			e1.printStackTrace();
		}
		return false;
	}
}
