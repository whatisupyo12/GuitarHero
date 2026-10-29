//Ishan Meher
//Apurv Sahu
//Period 7

public class RingBuffer 
{	
	private double[] buffer;
	private int first;
	private int last;
	private int capacity;
	private int size;
	public RingBuffer(int capacity1) {
		
		buffer = new double[capacity1];
		first = 0;
		last = 0;
		size = 0;
		capacity = capacity1;
		
	}
	
	public int size() {
		return size;
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
		size++;
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
		size--;
		return temp;
		//test
	}
	
	public double peek() {
		return buffer[first];
	}
	
	public String toString() {
		if(isEmpty())
		{
			return "[]";
		}
		String info = "[";
		int counter = first;
		for(int i = 0; i < size; i++)
		{
			if(counter == size)
			{
				counter = 0;
			}
			info += buffer[counter];
			if(i < size-1)
			{
				info +=", ";
			}
			counter++;
		}
		info += "]";
		return info;
	}
}
