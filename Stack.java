package com.brianmcmichael;

public class Stack<Item> 
{
  private Node first = null;
	
	private class Node
	{
		Item item;
		Node next;
	}
	
	public boolean isEmpty()
	{	return first == null;	}
	
	public void push(Item item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
}
