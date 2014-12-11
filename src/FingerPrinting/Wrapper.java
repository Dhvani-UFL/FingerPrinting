import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Struct;

import org.apache.tika.exception.TikaException; 
import org.apache.tika.metadata.Metadata; 
import org.apache.tika.parser.ParseContext; 
import org.apache.tika.parser.Parser; 
import org.apache.tika.parser.mp3.Mp3Parser; 
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Wrapper 
{
	// This is the class that is called in the reducer function
	// This class acts as a wrapper class, and has two major functions
	// First, it gets the fingerprint of a song
	// Second, it also gets the meta data of the song
	// The input this class receives is a filepath of the song.
	
	FingerPrintGenerator fpgen = new FingerPrintGenerator();
	String fingerprint;
	
	
	// This is the first method, that is used to get the fingerprint of the class
	public String GetFingerPrint(String SongFilePath) throws IOException
	{
		InputStream is = new FileInputStream(SongFilePath);
		fingerprint = fpgen.Generatefingerprint(new BufferedInputStream(is));
		return fingerprint;
	}

	
	// this is the second method, this is used to get the metadata of the song.
	public MetaData GetMetaData(String SongFilePath) throws IOException
	{
		try { 
			 
	        InputStream input = new FileInputStream(SongFilePath);
	        ContentHandler handler = new DefaultHandler();
	        Metadata metadata = new Metadata();
	        Parser parser = new Mp3Parser();
	        ParseContext parseCtx = new ParseContext();
	        parser.parse(input, handler, metadata, parseCtx);
	        input.close();
	 
	        // List all metadata 
	       /* String[] metadataNames = metadata.names();
	 
	        for(String name : metadataNames){
	        System.out.println(name + ": " + metadata.get(name));
	        } */
	 
	        // Retrieve the necessary info from metadata 
	        // Names - title, xmpDM:artist etc. - mentioned below may differ based 
	        /*System.out.println("----------------------------------------------");
	        System.out.println("Title: " + metadata.get("title"));
	        System.out.println("Artists: " + metadata.get("xmpDM:artist"));
	        System.out.println("Composer : "+metadata.get("xmpDM:composer"));
	        System.out.println("Genre : "+metadata.get("xmpDM:genre"));
	        System.out.println("Album : "+metadata.get("xmpDM:album"));*/
	 
	        } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        } catch (IOException e) {
	        e.printStackTrace();
	        } catch (SAXException e) {
	        e.printStackTrace();
	        } catch (TikaException e) {
	        e.printStackTrace();
	        } 
	        } 
		
		return metadata;
	}
	
	
}


