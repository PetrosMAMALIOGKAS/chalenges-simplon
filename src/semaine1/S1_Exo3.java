package semaine1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class S1_Exo3 {

	public static void main(String[] args) {
			BigDecimal dollarValueForAEuro = new BigDecimal(1.23);
			BigDecimal conversionResult = new BigDecimal(0);
			System.out.println("******************************************");
			System.out.println("******  EUROS       DOLLARS     ********");
			
			for (int euros = 1; euros < 101; euros++) {
					
					conversionResult = conversionResult.add(dollarValueForAEuro);
					// rounding result -> 2 digit CEILING MODE
					conversionResult = conversionResult.setScale(2, RoundingMode.CEILING); 
					if (euros < 10) {
						
							System.out.println("          €" + euros + "   |     $" + conversionResult.toString());
					}
					else if (euros == 100) {
						
							System.out.println("        €" + euros + "   |     $" + conversionResult.toString());
					}
					else {
						
							System.out.println("         €" + euros + "   |     $" + conversionResult.toString());
					}
				    
			}
	}

}
