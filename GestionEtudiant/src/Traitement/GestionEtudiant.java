package Traitement;

import java.util.Scanner;
import java.util.Vector;
import Entities.*;
public class GestionEtudiant {
Scanner sc = new Scanner(System.in);
	public Vector v = new Vector();
	public void commande() {
		GestionEtudiant aj= new GestionEtudiant();
		EtudiantDao mo= new EtudiantDao();
		EtudiantDao supp=new EtudiantDao();
		while (true) {
			System.out.println("appuyer 1 pour ajouter | appuyer 2 pour modifier | appuyer 3 pour supprimer | appuyer 4 pour afficher Rt");
			int i=sc.nextInt();
			switch (i) {
			case 1: aj.ajouterEtudiant();break;
			case 2:mo.modification();break;
			case 3:supp.suppression();break;
			case 4:mo.query();break;
			//case 5:mo.methode(null);break;
			default : System.out.println("a bientot");break;
			
			}
			if(sc.next().equalsIgnoreCase("o"))
				break;
		}
	}
	
public 	Vector ajouterEtudiant()
	{
	EtudiantDao gestion=new EtudiantDao();
	
	while(true)
	{
		Etudiant e = new Etudiant();
		System.out.println("veuillez saisir le Nom de l'etudiant : ");
		 e.nom =sc.next();
		 System.out.println("veuillez saisir le Prenom de l'etudiant : ");
		 e.prenom =sc.next();
			System.out.println("veuillez saisir la  Note : ");
				e.note= sc.nextDouble();
				System.out.println("veuillez saisir la  Note moyenne : ");
				e.notemoyenne= sc.nextDouble();
				 System.out.println("veuillez saisir votre password : ");
				 e.password =sc.next();
				gestion.ajoutEtudiant(e);
						v.add(e);
				System.out.println("Etudaint ajoutée avec succes");
				System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("o"))
					break;
	}
	for (int i = 0; i < v.size(); i++) {
		Etudiant r = new Etudiant();
		r = (Etudiant)v.get(i);
		
		System.out.println(r.nom + "=====>" + r.note);
	}
	
	
		
		return v;
	}
public	double calculerMoyenne(Vector<Etudiant> v)
	{
	double moy=0;
		// Calculer la moyenne v.get(i).note
	for (int i = 0; i < v.size(); i++) {
		moy=moy+v.get(i).note;
	
		
		
	}
	v.get(0).notemoyenne=moy/v.size();
	System.out.println("moyenne "+ v.get(1).notemoyenne);
	return moy/v.size();
	
}
}