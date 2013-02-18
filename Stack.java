package com.brianmcmichael;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>
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
	
	public Item pop()
	{
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	public Iterator<Item> iterator() { return new ListIterator(); }
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;
		
		public boolean hasNext() 	{ return current != null; }
		public void remove()		{ /* Not Implemented */ }
		public Item next()
		{
			Item item = current.item;
			current	= current.next;
			return item;
		}
	}
	
	/*  
	public Iterator<Item> iterator()
    { return new ReverseArrayIterator(); }
    
	private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = N;
        public boolean hasNext() {  return i > 0;        }
        public void remove()     {  					 }
        public Item next()       {  return s[--i];       }
    }
    */
	
	
}
