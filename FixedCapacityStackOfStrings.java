package com.brianmcmichael;

public class FixedCapacityStackOfStrings 
{
	private String[] s;
	private int N = 0;
	
	//A cheat to limit capacity by requiring input
	public FixedCapacityStackOfStrings(int capacity)
	{	s = new String[capacity];	}
	
	public boolean isEmpty()
	{	return N == 0;	}
	
	public void push(String item)
	{	s[N++] = item; }
	
	public String pop()
	{	
		String item = s[--N];
		s[N] = null;
		return item;	
	}
}
