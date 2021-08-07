package graph;

import java.util.Scanner;

//Adj Matrix - user input
class AdjMatrixNonWeightedGraph1 {
	private boolean mat[][];
	private int vertCount, edgeCount;

	public AdjMatrixNonWeightedGraph1(int vertCount) {
		this.edgeCount = 0;
		this.vertCount = vertCount;
		mat = new boolean[vertCount][vertCount];
	}

	public void input(Scanner sc) {
		System.out.print("Enter number of edges: ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter edge (from to): ");
			int from = sc.nextInt();
			int to = sc.nextInt();
			mat[from][to] = true;
			mat[to][from] = true; // considering graph as un-directed.
		}
	}

	public void display() {
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++) {
				System.out.print(mat[i][j] ? "1 " : "0 ");

			}
			System.out.println();
		}
	}
}

public class AdjMatrixUserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of vertices   :  ");
		int vertCount = sc.nextInt();

		AdjMatrixNonWeightedGraph1 g = new AdjMatrixNonWeightedGraph1(vertCount);
		g.input(sc);
		g.display();
	}

}

/*
6 
7 
0 1 
0 2 
0 3 
1 2 
1 4 
3 4 
3 5
 
*/