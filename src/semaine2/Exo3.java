package semaine2;

import utils.Clavier;

public class Exo3 {

	public static void main(String[] args) {
		System.out.println( "bOnjour vous avez quelle age ? ");
		int age = Clavier.readInt();
		
		while ( age < 1 || age > 110 ) {
			System.out.println( "Age pas valide veuilliez reinserer une age entre 1 et 120 ans..");
			age = Clavier.readInt();
		}
				
		if ( age >= 60 ) {
			logPrixticket(4);
		}
		else if  ( age > 3  ) {
			System.out.println( "Vous habitez à Montreuil ? 1=Oui / 2 = Non" );
			int habitantMontreuil = Clavier.readInt();
			
			while ( habitantMontreuil != 1 && habitantMontreuil != 2 ) {
				System.out.println( "Reponse pas valide veuilliez reinserer une reponse  1=Oui / 2 = Non");
				habitantMontreuil = Clavier.readInt();
			}
			
			if (  habitantMontreuil == 1 ) {
				logPrixticket(5);
			}
			else {
				logPrixticket(8);
			}
		
		}
		else {
			logPrixticket(0);
		}
		
		
	}
	
	public static void logPrixticket(int prix) {
		if  ( prix == 0 ) {
			System.out.println( "C'est gratuit pour les enfants");
		}
		else {
			System.out.println( "Le prix est " + prix  + " euros");
		}
	}

}
