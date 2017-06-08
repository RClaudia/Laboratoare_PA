package dijkstra;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Dijkstra dij = new Dijkstra();
		dij.dijkstra(n);



	}

}
