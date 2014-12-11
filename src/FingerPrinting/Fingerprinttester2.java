import org.junit.test;
import static org.junit.Assert.*;




package FingerprintTesting;

public class Fingerprinttester2
{
	@Test
	public void testingmethod0()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/MJ/You Rock My World.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testingmethod1()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/Eminem/Real Slim Shady.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod2()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/Eminem/Superman.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod3()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/Taylor Swift/love.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod4()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/Taylor Swift/You belong with me.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod5()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/MJ/They don't care about us.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod6()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/MJ/Beat it.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod7()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/Fray/Backwards.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod8()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/Shakira/Whenever.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod9()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/Shakira/Hips dont lie.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testingmethod10()
	{
		Wrapper mywrapper = new Wrapper();
		
		String filepath = "E:/Songs/NickelBack/Someday.mp3";
		try
		{
			mywrapper.GetFingerPrint(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}

