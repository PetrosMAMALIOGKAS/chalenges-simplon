package semaine2;

import utils.Clavier;

public class Exo2 {

	public static void main(String[] args) {
		
		char[] tableauLettres = new char[5];
		tableauLettres[0] =  'a';
		tableauLettres[1] =  'e';
		tableauLettres[2] =  'i';
		tableauLettres[3] =  'o';
		tableauLettres[4] =  'u';
		tableauLettres[4] =  'y';
		
		boolean rejouer = false;
		
		while ( !rejouer ) {
			char lettre = Clavier.readChar();
			
			if ( lettre > 64 && lettre < 91) {
				
				lettre = (char) (lettre + 32);
			}
			
			
			boolean  itIsVoyel = false;
			int i = 0;
			int indiceFinal = 0;
			
			 
			for ( char caracterCourant : tableauLettres ) {
				
				if ( caracterCourant == lettre ) {
					
					itIsVoyel = true;
					indiceFinal = i;
				}
				
				i++;
			}
			
			if ( !itIsVoyel ) {
				System.out.println( "il me faut un voyel" );
				
			}
			else {
				
				System.out.println( "Le lettre trouvé dans l array à la place " + indiceFinal );
				
				char reponse;
				System.out.println( "Vous voulez rejouer (N/O) ? " );
				reponse = Clavier.readChar();
				
				while ( reponse != 'O' && reponse != 'o' && reponse != 'N' && reponse != 'n' )
				{
					System.out.println( "Donnez moi une reponse valide (N/O) ? " );
					reponse = Clavier.readChar();
					System.out.println( "entree " + reponse);
				} 
				
				if ( reponse == 'N' || reponse == 'n' ) {
					System.out.println( "Au revoir" );
					rejouer = true;
				}
			}
				
			
		}
		
	}

}
