import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class Mp3tobyteConverter 
{
	
	// This method is called to convert an input stream to a byte array.
	// This byte array is used in the FingerPrintGenerator class. 
	// The actual finger printing calculations are done on the byte array.
	
	public byte[] inputStreamToByteArray(InputStream inStream) throws IOException 
	{
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    byte[] buffer = new byte[8192];
	    int bytesRead;
	    while ((bytesRead = inStream.read(buffer)) > 0) 
	    {
	        baos.write(buffer, 0, bytesRead);
	    } 
	    return baos.toByteArray();
	} 
}
