/**
 *This Package consists of classes that deal with searching for fingerprint of a song on the database. 
 */
/**
 * @author Teja
 *
 */
package Searching;

import java.io.File;
import java.io.IOException;
import java.util.*;



public abstract class Searcher{
	
	// This method takes the fingerprint in JSON format as parameter and parses it to retrieve the Hash key 	
	public abstract void parse (String Code);
	
	
	//lookup method searches for matching HashKeys from inverted index
	public abstract String[] lookup (String Hash);
	
	//SetQueryHash method stores the extracted hash keys of the Query audio clip
	public void  setQueryHash (String Hash)
	{
		// Parse the Hash code and store in a temporary data structure
	}
	
	public static void main (String args[])
	{
		// Histogram hg = new Histogram();
		 
		//hg.crtHist(String Hash)
		
		// compare the results of the frequency of top offset difference against the value of its successor.
	}
}
