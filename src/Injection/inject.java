/**
 * 
 */
/**
 * @author Teja
 *
 */
package Injection;

import java.io.File;
import java.io.IOException;
import java.util.*;
import FingerPrinting.*;
import Searching.*;


public abstract class inject
{
	//AudioBuffer fp1 = new AudioBuffer();
	//JasonParser Js1 = new JasonParser();
	
	//fp1.PCMConversion();
	//fp1.Whitening();
	//fp1.SubbandAnalysis();
	//fp1.generatefingerprint();

	// addHash method adds the Hash codes into the database
	public abstract void addHash (String Hash);

	
	public void analyze (String JsonHash)
	{
		//extract Hash Key and Timing
		//lookup for the presence of Hash Keys in the Database
		//Js1.lookup (fp1.hashkeys);
		
		// if (fp1.exists())
		// {
		//	System.out.println("Song already present in Database");
		// }
		
		// else
		// {
		//		addHash(fp1.Hashkeys);
		// }
	}
}