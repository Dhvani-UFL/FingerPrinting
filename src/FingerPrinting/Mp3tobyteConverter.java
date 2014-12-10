import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class Mp3tobyteConverter 
{
	public byte[] inputStreamToByteArray(InputStream inStream) throws IOException {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    byte[] buffer = new byte[8192];
	    int bytesRead;
	    while ((bytesRead = inStream.read(buffer)) > 0) {
	        baos.write(buffer, 0, bytesRead);
	    } 
	    return baos.toByteArray();
	} 
}
