package semaine1;

import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class S1_Exo5 {

	public static void main(String[] args) {
		ArrayList<Object> tokens = new ArrayList<Object>();
		String s = "Here, we 'll change' the default \n configuration and create another example.";
		try {
			tokens = (ArrayList<Object>) streamTokenizerWithDefaultConfiguration(new StringReader(s));

			
		} catch (Exception e) {
			System.out.println("Exception caught....");
		}
		System.out.println("number of words " + tokens.size());
		for (Object tok: tokens) {
			System.out.println(tok);
		}
	}
	
	private static final int QUOTE_CHARACTER = '\'';
	private static final int DOUBLE_QUOTE_CHARACTER = '"';
	
	public static List<Object> streamTokenizerWithDefaultConfiguration(Reader reader) throws IOException {
	    StreamTokenizer streamTokenizer = new StreamTokenizer(reader);
	    List<Object> tokens = new ArrayList<Object>();
	    
	    //  The end of line counts 
	    streamTokenizer.eolIsSignificant(true);
	    int currentToken = streamTokenizer.nextToken();
	    int numberOfLines = 0;
	    
	    while (currentToken != StreamTokenizer.TT_EOF) {

	        if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
	            tokens.add(streamTokenizer.nval);
	        } 
	        else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
	            tokens.add(streamTokenizer.sval);
	        } 
	        else if (streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
	        	numberOfLines = numberOfLines + 1;
	        }
	        else if (streamTokenizer.ttype == QUOTE_CHARACTER || streamTokenizer.ttype == DOUBLE_QUOTE_CHARACTER)  {
	        	// case of recursion ?
	        }
	        else {
	            tokens.add((char) currentToken);
	        }

	        currentToken = streamTokenizer.nextToken();
	    }
	    tokens.add("lines " + String.valueOf(numberOfLines) );

	    return tokens;
	}
}
