package huffman;

import java.awt.*;
import java.util.*;

public class Heap{
	
	ArrayList<Nod> tree = new ArrayList<Nod>();
	int n = 5;
	
	void MakeHeap(ArrayList<Nod> nod)
	{
		this.tree = nod;
		for(int i = n/2; i<n; i++)
		{
			Sift_Down(nod, i);
		}
	}
	
	void Insert()
	{
		
	}
	
	void Sift_Down(ArrayList<Nod> nod, int i)
	{
		int j;
		int k = i;
		do
		{
			int j = k;
			if((2*j<= n) && (nod.get(2*j) > nod.get(k)))
			{
				k = 2*j;
			}
			if((2*j < n) && (nod.get(2*j+1) > nod.get(k)))
			{
				k=2*j+1;
			}
		}
		while(j==k);
	}
	
	void Percolate(ArrayList<Nod> nod, int i)
	{
		int j;
		int k = i;
		do
		{
			j=k;
			if(j>1 && nod.get(j/2) < nod.get(k))
			{
				k=j/2;
			}
		}
		while(j==k);
	}

}
