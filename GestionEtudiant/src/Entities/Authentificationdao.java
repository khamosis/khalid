package Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Authentificationdao {
	// Creer une cnx (lien) vers une base de donnees
		Connection cnx;
		// Pour envoyer et executer des requetes sql
		Statement st;
		// Récuperation des résultat
		ResultSet rsq;
		public Authentificationdao() {
			String chaine="jdbc:mysql://localhost:3306/gestionetudiant?verifyServerCertificate=false&useSSL=true";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
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
		public boolean login(String a,String b) {
			try {
				st=cnx.createStatement();
				rsq=st.executeQuery("select password from user where login ='"+a+"'");
				
				if(rsq.next()) {
					if(rsq.getString("password").equals(b))
						return true;
					else return false;
					
				}
				else return false;
				
			}catch(SQLException e1){
				e1.printStackTrace();
				return false;
			}
			
		}

}
