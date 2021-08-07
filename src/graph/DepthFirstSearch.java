package graph;

import java.util.Stack;

class DFSgraph {
	private boolean adjMatrix[][];
	private int numVertices;

	public DFSgraph(int numVertices) {
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

	public void dfsTrav(int start) {
		Stack<Integer> s = new Stack<>(); // 1. create stack of vertices
		boolean[] marked = new boolean[numVertices];//2.create array to mark vertices.
		s.push(start); // 3. push starting vertex on stack and mark it
		marked[start] = true;
		while (!s.isEmpty()) {
			int trav = s.pop(); // 4.pop a vertex from stack -say trav
			System.out.print(trav + " "); // 5. print the vertex
			// 6. find all not marked vertices and push on stack and mark them.
			for (int to = 0; to < numVertices; to++) {
				if (adjMatrix[trav][to] == true && !marked[to]) {
					s.push(to);
					marked[to] = true;
				}
			}
		} // 7. repeat 4 to 6 till stack is empty.
		System.out.println();
	}
}

public class DepthFirstSearch {
	public static void main(String[] args) {

		DFSgraph g = new DFSgraph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.display();
		
		System.out.println();
		System.out.print("DFS trav :   ");
		g.dfsTrav(0);

	}

}
