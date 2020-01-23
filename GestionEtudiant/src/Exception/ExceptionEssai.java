package Exception;

import java.security.PublicKey;

public class ExceptionEssai {
    static void  methode (int a, int b) throws ExceptionAEgalB{
		if (a == b)
			throw new ExceptionAEgalB ();
		else
			System.out.println (a+" et "+b+" OK !");
	}

	public void Test() {
		try {
			methode (2,2);
			System.out.println ("Pas d'erreur");
		}
		catch (ExceptionAEgalB  exp) {
			System.out.println ("Erreur "+exp.message());
		}
		finally{
		 System.out.println ("Message final");
		}
	}
}
