package Abstrait;

public class Rectangle extends Figure{
	 private double largeur ;
     private double longueur ;
     public Rectangle (double largeur , double longueur )
     {
                       super ( " rectangle" ) ;
                       System.out.println("Saisir la largeur : ");
                       largeur=sc.nextDouble();
                       this.largeur = largeur ;
                       System.out.println("Saisir la longeur : ");
                       longueur=sc.nextDouble();
                       this.longueur = longueur; 
                       
     }
     public double aire ( )
    { 
    	 double i;
    	 double a=this.largeur,b=this.longueur;
    	 
                       return a*b; 
                       
     } 

}
