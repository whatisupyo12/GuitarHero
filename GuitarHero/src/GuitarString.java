
public class GuitarString {
	
	public RingBuffer ringBuffer;
	
	public GuitarString(double frequency)
	{
		int cap = (int) Math.ceil(44100.0/frequency);
		ringBuffer = new RingBuffer(cap);
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
