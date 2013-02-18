package com.brianmcmichael;

public class QuickUnionImproved 
{  
	private int[] id;
	private int[] sz;
	
	public QuickUnionImproved(int N)
	{
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
	}
	
	private int root(int i)
	{
		while (i != id[i])
		{
			//This line adds path compression
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q)
	{
		return root(p) == root(q);
	}
	
	public void union(int p, int q)
	{
		int i = root(p);
		int j = root(q);
		//If-else statement weights the union to avoid tall trees.
		if (sz[i] < sz[j]) 	{ id[i] = j; sz[j] += sz[i]; }
		else				{ id[j] = i; sz[i] += sz[j]; }
	}
	
	public int[] getId()
	{
		return id;
	}
		
}
