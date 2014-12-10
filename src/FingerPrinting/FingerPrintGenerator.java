import java.io.IOException;
import java.io.InputStream;


public class FingerPrintGenerator 
{
	//Find out in which range
    
    public static int getIndex(int freq, int[] RANGE) 
    {
        int i = 0;
        while(RANGE[i] < freq) i++;
            return i;
    }
	
	public void Generatefingerprint(InputStream inStream) throws IOException
	{
		int Chunk_size = 4096;
		Mp3tobyteConverter object1 = new Mp3tobyteConverter();
		byte audio[] = object1.inputStreamToByteArray(inStream);
		
		final int totalSize = audio.length;
		
		int amountPossible = totalSize/Chunk_size;
		
		//When turning into frequency domain we'll need complex numbers:
		
		double[] results = new double[amountPossible];
		
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
		    
		  //For every line of data:
		    final int[] RANGE = new int[] {40,80,120,180, results.length+1};
		    double[] highscores = new double[results.length];
		    double[] recordPoints = new double[results.length];
 		    for (int freq = 0; freq < results.length-1; freq++) {
		    
		        //Get the magnitude:
		    
		        double mag = Math.log(Math.abs(results[freq]) + 1);
		    
		        //Find out which range we are in:
		    
		        int index = getIndex(freq, RANGE);
		    
		        //Save the highest magnitude and corresponding frequency:
		    
		        if (mag > highscores[index])
		        {
		            highscores[index] = mag;
		            recordPoints[index] = freq;
		        }
		    }
		    
		   
		}

	}
	
	
}
