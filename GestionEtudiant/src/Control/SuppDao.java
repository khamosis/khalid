package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entities.Etudiant;

public class SuppDao {
	

	
		
		// Creer une cnx (lien) vers une base de donnees
		Connection cnx;
		// Pour envoyer et executer des requetes sql
		Statement st;
		// Récuperation des résultat
		ResultSet rsq;
		
		
		public SuppDao() {
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
		
		public boolean supp(String code) {
			
			
			String requete=("delete from gestion where CIN='"+code+"'");
			try {
				st=cnx.createStatement();
				int i =st.executeUpdate(requete);
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			
			
			
			}return false;
			}}