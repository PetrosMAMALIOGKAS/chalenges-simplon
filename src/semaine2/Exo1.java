package semaine2;

public class Exo1 {

	public static void main(String[] args) {

		char[] tableauLettres = new char[5];
		tableauLettres[0] =  'o';
		tableauLettres[1] =  'E';
		tableauLettres[2] =  'a';
		tableauLettres[3] =  'O';
		tableauLettres[4] =  'i';
		
		
		for ( int i = 0; i <= tableauLettres.length - 1; i++ )  {
			System.out.println( "le caracter de " + i + " est le " + tableauLettres[ i ]);
		}
		                   

	}

}
