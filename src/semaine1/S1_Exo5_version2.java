package semaine1;



public class S1_Exo5_version2 {

	public static void main(String[] args) {
		String s = "cfdfd \n $$ dhhd";
		// The characters that are considered as separators between words 
		String[] tokens = s.split("[\\n,!?'$ ]", 0);
		int wordsCount = 0;
		for (String chaine: tokens) {
			System.out.println("*****" + chaine);
			if (!chaine.equals("")) {
				wordsCount++;
			}
		}
		// +2 because I must subtract 2 at the line 23 in order to run properly my algorithme
		int sauteLigneindex = s.length() + 2;
		int numberOfLines = 0;
		
		while (sauteLigneindex != -1) {
			
			sauteLigneindex = s.lastIndexOf("\n", sauteLigneindex - 2);
			numberOfLines++;
		}
		
		System.out.println("Lines.........: " + numberOfLines);
		System.out.println("Words.........: " + wordsCount);
		//  the n of the new line considered as a character so I subtract the number of newlines-1 the initial 
		System.out.println("Characters ...: " + (s.length() - numberOfLines + 1));
	}

}
