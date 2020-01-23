package Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class EtudiantDao {
	// Creer une cnx (lien) vers une base de donnees
	Connection cnx;
	// Pour envoyer et executer des requetes sql
	Statement st;
	// Récuperation des résultat
	ResultSet rsq;
	
	
	public EtudiantDao() {
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

	public void ajoutEtudiant(Etudiant e) {
		
		
		
			try {
				st= cnx.createStatement();
				//int i = st.executeUpdate("insert into etudiant(NOM,PRENOM,NOTE,NOTEMOYENNE) values ('"+e.nom+"','"+e.prenom+"''"+e.note+"')");
				int i = st.executeUpdate("insert into gestion(NOM,PRENOM,NOTE,NOTEMOYENNE) values ('"+e.nom+"','"+e.prenom+"','"+e.note+"','"+e.notemoyenne+"')");
				System.out.println("Enregistrement avec succès "+ i);



	
			} catch (SQLException e1) {
				
				System.out.println("Poblème d'enregistrement ");
				e1.printStackTrace();
			}
		
		
	}
	public void modification(){
		
		int code;
		double notej;
		Scanner sc=new Scanner(System.in);
		System.out.println("Veuillez saisir le code d'étudion : ");
		code =sc.nextInt();
		System.out.println("Veuillez saisir la nouvelle note : ");
		notej = sc.nextDouble();
		try {
			st = cnx.createStatement();
			int i = st.executeUpdate("update gestion set note="+notej+ " where cin="+code);
			System.out.println("Modification avec succès ");
		} catch (SQLException e1) {
			System.out.println("Problème de modif");
			e1.printStackTrace();
		}
		
	}
	
	public void suppression(){
		int code;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Veuillez saisir le code d'étudiant que vous voulez supprimer : ");
		code =sc.nextInt();
		
		try {
			st = cnx.createStatement();
			int i = st.executeUpdate("delete from gestion where CIN="+code);
			System.out.println("Suppression avec succès ");
		} catch (SQLException e1) {
			System.out.println("Problème de Supp");
			e1.printStackTrace();
		}
		
	}
	
	public void query() {
		try {
			st=cnx.createStatement();
			rsq=st.executeQuery("select * from gestion");
			System.out.println("Query ok");
			
		}catch(SQLException e1){
			System.out.println("Query failed !");
			e1.printStackTrace();
		}
		try {
			while(rsq.next()) {
				System.out.println(rsq.getInt(1)+" | "+rsq.getString("NOM")+"  "+rsq.getString("PRENOM")+" | "+rsq.getDouble("NOTE")+" | "+rsq.getDouble("Notemoyenne")+"|");
			}
			System.out.println("");
			System.out.println("Mission accomplished");
		}catch(SQLException e1) {
			System.out.println("");
			System.out.println("Mission failed");
			e1.printStackTrace();
		}
	}

	

	
}
