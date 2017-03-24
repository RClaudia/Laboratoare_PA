package Exercitiu_1;

import java.util.*; 


import Structs.Point;

public class Maze {
	
	

	public static void main(String[] args) {

		
		ArrayList<ArrayList<Integer>> maze;
		maze = new ArrayList<ArrayList<Integer>>();
		
		
		
		ArrayList<Integer> firstline = new ArrayList<Integer>();
		firstline.add(1);
		firstline.add(0);
		firstline.add(0);
		maze.add(firstline);
		
		ArrayList<Integer> secondline = new ArrayList<Integer>();
		secondline.add(1);
		secondline.add(1);
		secondline.add(0);
		maze.add(secondline);
		
		ArrayList<Integer> thirdline = new ArrayList<Integer>();
		thirdline.add(0);
		thirdline.add(1);
		thirdline.add(1);
		maze.add(thirdline);
		
		
		for(int i=0;i<maze.size();i++)
		{
			System.out.println();
			
			for(int j=0;j<maze.get(i).size();j++)
			{
				System.out.print(maze.get(i).get(j) + " ");
				
				//if (maze.get(i).get(j)==1)stack.push(new Point(i,j));
			}
		}	
		
		Maze lab = new Maze();
		
		
	}
	
	class maze
	{
		int N=3;
		Stack<Point> stack = new Stack<Point>();
		
		
		boolean Parcurgere(int[][] maze, int x, int y)
        {
            if (x == N - 1 && y == N - 1)
            {
                Point punct = new Point(x, y);
                stack.push(punct);

                return true;
            }

            if ((x >= 0) && (x < N) && (y >= 0) && (y < N) && (maze[x][y] == 1))
            {
                Point punct = new Point(x, y);
                stack.push(punct);

                if (Parcurgere(maze, x + 1, y))
                {
                    return true;
                }

                if (Parcurgere(maze, x, y + 1))
                {
                    return true;
                }
                                
            }
			return false;

        }
		
		void afisare()
		{
			System.out.println("Rezultatul este: ");
			
		}
	}
	
}






















