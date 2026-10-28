//Ishan Meher
//Apurv Sahu
//Period 7

public class RingBuffer 
{	
	private double[] buffer;
	private int first;
	private int last;
	private int capacity;
	public RingBuffer(int capacity) {
		
		buffer = new double[capacity];
		first = 0;
		last = 0;
		this.capacity = capacity;
		
	}
	
	public int size() {
		int s = 0;
		for (int i = 0; i < buffer.length;i++)
		{
			if(buffer[i] != 0)
			{
				s++;
			}
		}
		return s;
	}
	
	public boolean isEmpty() {	
		if(size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(size() == capacity)
		{
			return true;
		}
		return false;
	}
	public void enqueue(double x) {
		if(isFull())
		{
			throw new IllegalStateException("The Buffer is full");
		}
		if(((last+1) == capacity))
		{
			buffer[last] = x;
			last = 0;
		}
		else
		{
			buffer[last] = x;
			last++;
		}
	}
	
	public double dequeue() {
		double temp = 0.0;
		temp = buffer[first];
		buffer[first] = 0.0;
		if((first+1) == capacity)
		{
			first = 0;
		}
		else
		{
			first++;
		}
		return temp;
		//test
	}
	
	public double peek() {
		return buffer[first];
		
	}
	
	public String toString() {
		String info = "[";
		int c = first;
		while(c != last)
		{
			info += buffer[c] + ", ";
			
		}
	}
}
