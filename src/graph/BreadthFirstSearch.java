//BFS using Adj matrix.
package graph;

import java.util.LinkedList;
import java.util.Queue;

class BFSgraph {
	private boolean adjMatrix[][];
	private int numVertices;

	public BFSgraph(int numVertices) {
		this.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
	}

	public void addEdge(int i, int j) {
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}

	// print matrix
	public void display() {
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				System.out.print(adjMatrix[i][j] ? "1 " : "0 ");
			}
			System.out.println();
		}
	}

	public void bfsTrav(int start) {
		Queue<Integer> s = new LinkedList<>(); // 1. create queue of vertices
		boolean[] marked = new boolean[numVertices];// 2.create array to mark vertices.
		s.offer(start); // 3. push starting vertex on queue and mark it
		marked[start] = true;
		while (!s.isEmpty()) {
			int trav = s.poll(); // 4.pop a vertex from queue -say trav
			System.out.print(trav + " "); // 5. print the vertex
			// 6. find all not marked adjacent vertices & push on queue & mark them.
			for (int to = 0; to < numVertices; to++) {
				if (adjMatrix[trav][to] == true && !marked[to]) {
					s.offer(to);
					marked[to] = true;
				}
			}
		} // 7. repeat 4 to 6 till queue is empty.
		System.out.println();
	}
}

public class BreadthFirstSearch {

	public static void main(String[] args) {
		BFSgraph g = new BFSgraph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.display();

		System.out.println();
		System.out.print("BFS trav :   ");
		g.bfsTrav(0);
	}

}
