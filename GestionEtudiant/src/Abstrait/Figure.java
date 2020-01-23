package Abstrait;

import java.util.Scanner;

abstract public class Figure {
	Scanner sc=new Scanner(System.in);
	private String nom;
	public Figure(String nom) {
		this.nom=nom;
		System.out.println("Saisir un nom: ");
		nom=sc.next();
	}

	abstract public double aire();


public void quiSuisJe ( )   //polymorphisme
{
	System.out.println ( " Je   suis  un " + this.nom) ;
 }
}
