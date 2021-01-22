package semaine1;

import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class S1_Exo5_version1 {

	public static void main(String[] args) {
		ArrayList<Object> tokens = new ArrayList<Object>();
		
		String s = "paok \n fekjfke !! $$ rrr";
		try {
			tokens = (ArrayList<Object>) streamTokenizerWithCustomConfiguration(new StringReader(s));			
		} 
		catch (Exception e) {
			System.out.println("Exception caught....");
		}
		
		String chaineWithoutLineBreaks = s.replaceAll("\\n", "");
		
		System.out.println(tokens.get(tokens.size() -1 ));
		System.out.println("number of words " + (tokens.size() - 1));
		System.out.println("Number of caracters " + chaineWithoutLineBreaks.length());
	}
	
	public static List<Object> streamTokenizerWithCustomConfiguration(Reader reader) throws IOException {
	    StreamTokenizer streamTokenizer = new StreamTokenizer(reader);
	    List<Object> tokens = new ArrayList<Object>();
	  
	    //  The end of line if detected, counts as a token
	    streamTokenizer.eolIsSignificant(true);
	    
	    // define that these characters    !"# $%&(')+*,-./
	    // counts as white spaces
	    streamTokenizer.whitespaceChars(33, 47);
	    
	    int currentToken = streamTokenizer.nextToken();
	    int numberOfLines = 1;
	    
	    while (currentToken != StreamTokenizer.TT_EOF) {

	        if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
	            tokens.add(streamTokenizer.nval);
	        } 
	        else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
	            tokens.add(streamTokenizer.sval);
	        } 
	        else if (streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
	        	numberOfLines++;
	        }
	        else {
	            tokens.add((char) currentToken);
	        }

	        currentToken = streamTokenizer.nextToken();
	    }
	    
	    tokens.add("Number of lines " + String.valueOf(numberOfLines) );

	    return tokens;
	}
 
}
