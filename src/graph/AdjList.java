package graph;

import java.util.LinkedList;

class Graph1 {
	int vertexCount;
	LinkedList<Integer> adjList[];

	public Graph1(int vertexCount) {
		this.vertexCount = vertexCount;
		adjList = new LinkedList[vertexCount];
		for (int i = 0; i < vertexCount; i++) {
			adjList[i] = new LinkedList();
		}
	}

	void addEdge(int source, int destination) {
		adjList[source].add(destination);
		adjList[destination].add(source);
	}

	void printGraph() {
		for (int v = 0; v < vertexCount; v++) {
			System.out.print("adj list " + v + " ==>  ");

			for (Integer val : adjList[v]) {
				System.out.print(val + " ");
			}
			System.out.println("\n");
		}
	}
}

public class AdjList {
	public static void main(String[] args) {
		Graph1 g = new Graph1(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(3, 4);
		g.addEdge(3, 5);

		g.printGraph();

	}

}
