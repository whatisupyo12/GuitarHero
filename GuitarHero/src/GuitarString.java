
public class GuitarString {
	
	public RingBuffer ringBuffer;
	private int time;
	private int cap;
	
	public GuitarString(double frequency)
	{
		cap = (int) Math.ceil(44100.0/frequency);
		ringBuffer = new RingBuffer(cap);
	}
	
	public GuitarString(double[] init)
	{
		ringBuffer = new RingBuffer(init.length);
		for(int i = 0; i < init.length;i++)
		{
			ringBuffer.enqueue(init[i]);
		}
	}
	
	public void pluck()
	{
		for(int i = 0; i < cap; i++)
		{
			ringBuffer.dequeue();
			int temp = (int)(Math.random() * 2);
			if(temp == 1)
			{
				ringBuffer.enqueue(0.5 * Math.random());
			}
			else
			{
				ringBuffer.enqueue(-0.5 * Math.random());
			}
		}
	}
	
	public void tic()
	{
		double first = ringBuffer.dequeue();
		double second = ringBuffer.peek();
		ringBuffer.enqueue(.994 * 0.5 * (first + second));
		time++;
	}
	
	public double sample()
	{
		return ringBuffer.peek();
	}
	
	public int time()
	{
		return time;
	}
}
