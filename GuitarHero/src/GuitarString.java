
public class GuitarString {
	
	public RingBuffer ringBuffer;
	
	public static void main(String[] args)
	{
		System.out.println(44100.0/14.0);
		int cap = (int) Math.round(44100.0/14.0);
	}
	
	public GuitarString(double frequency)
	{
		int cap = (int) Math.round(44100.0/frequency);
		
	}
	
	public GuitarString(double[] init)
	{
		
	}
	
	public void pluck()
	{
		
	}
	
	public void tic()
	{
		
	}
	
	public double sample()
	{
		return 0.0;
	}
	
	public int time()
	{
		return 0;
	}
}
