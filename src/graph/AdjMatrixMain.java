package graph;

class AdjMatrix {
	private boolean adjMatrix[][];
	private int numVertices;

	public AdjMatrix(int numVertices) {
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
}

public class AdjMatrixMain {

	public static void main(String[] args) {
		AdjMatrix g = new AdjMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);

		g.display();

	}

}
