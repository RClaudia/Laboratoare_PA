package dijkstra;

import java.util.ArrayList;

public class Dijkstra {
	
	public static void dijkstra(int n)
	{
		int[] C = new int[n];
		int[] S = new int[n];
		int[] D = new int[n];
		int[][] L = new int[n][n];
		int p=0;
		int v=0;
		int dimC = C.length;
		
		for(int i = 2; i< n; i++)
		{
			C[i] = i;
			S[i] = 1;
		}
		
		for(int i = 2; i< n; i++)
		{
			D[i] = L[1][i];
		}
		while(p < (n-2))
		{
			p++;
			
			//C\v
			for (int i = 2; i <= n; i++)
			{
				v = i;
			}
			//S U v
			for (int i = 1; i <= C.length; i++)
			{
				if (v == C[i]) 
				{
					for (int j = i; j < C.length; j++)
						C[i] = C[i + 1];
					dimC--;
				}
			}
			for(int w=1; w<C.length; w++)
			{
				if (D[C[w]] < D[v] + L[v][C[w]])
				{
					D[C[w]] = D[C[w]];
				}
				else
				{
					D[C[w]] = D[v] + L[v][C[w]];
				}
			}
		}
	}

}
