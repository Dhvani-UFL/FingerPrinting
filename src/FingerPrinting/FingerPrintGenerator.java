import java.io.IOException;
import java.io.InputStream;


public class FingerPrintGenerator 
{
	public void Generatefingerprint(InputStream inStream) throws IOException
	{
		int Chunk_size = 4096;
		Mp3tobyteConverter object1 = new Mp3tobyteConverter();
		byte audio[] = object1.inputStreamToByteArray(inStream);
		
		final int totalSize = audio.length;
		
		int amountPossible = totalSize/Chunk_size;
		
		//When turning into frequency domain we'll need complex numbers:
		
		double[][] results = new double[amountPossible][];
		
		//For all the chunks:
		
		for(int times = 0;times < amountPossible; times++) {
		
		    double[] complex = new double[Chunk_size];
		    double[] imag = new double[Chunk_size];
		    for(int i = 0;i < Chunk_size;i++) {
		
		        //Put the time domain data into a complex number with imaginary part as 0:
		
		        complex[i] = (audio[(times*Chunk_size)+i]);
		        imag[i] = 0;
		    }
		
		    //Perform FFT analysis on the chunk:
		
		    results[times] = FFT.fft(complex, imag, true);
		    
		    
		
		}

	}
	
	
}
