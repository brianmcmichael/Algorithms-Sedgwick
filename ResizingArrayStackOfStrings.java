package com.brianmcmichael;

public class ResizingArrayStackOfStrings 
{
  private String[] s;
	private int N = 0;
	
	//A cheat to limit capacity by requiring input
	public ResizingArrayStackOfStrings()
	{	s = new String[1];	}
	
	public boolean isEmpty()
	{	return N == 0;	}
	
	public void push(String item)
	{	
		//This line doubles the size of the array.
		if (N == s.length) resize(2 * s.length);
		s[N++] = item;
	}
	
	private void resize(int capacity)
	{
		String[] copy = new String[capacity];
		for (int i = 0; i < N; i++)
			copy[i] = s[i];
		s = copy;
	}
		
	public String pop()
	{	
		String item = s[--N];
		s[N] = null;
		//This line shrinks the array if it gets smaller.
		if (N > 0 && N == s.length/4) resize(s.length/2);
		return item;	
	}
}
