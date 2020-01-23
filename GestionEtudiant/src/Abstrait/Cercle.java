package Abstrait;

public class Cercle extends Figure {
	 private double rayon ;
     public Cercle ( double rayon)
    {
           super ( " cercle " ) ;
           System.out.println("Saisir le rayon: ");
           rayon=sc.nextDouble();
           this. rayon = rayon ; 
     }
     public double aire ( )
    { 
             return Math . PI *this . rayon*this . rayon ; 
    } 


}
