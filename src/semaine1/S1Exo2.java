package semaine1;

public class S1Exo2 {

	public static void main(String[] args) {
			int somme = 0;
			int counter = 1;
			
			while (counter < 5) {
					System.out.print( "no" +  counter );
					somme += Clavier.readInt();
					counter++;
			}
			
			System.out.println("The somme is...: " + somme);
	}
}
