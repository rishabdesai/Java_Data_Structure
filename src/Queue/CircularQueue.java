package Queue;

class CircularQ {
	private int[] arr;
	private int front, rear;
	private int count;

	public CircularQ(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
		count = 0;
	}

	public void push(int val) {
		rear = (rear + 1) % arr.length;
		arr[rear] = val;
		count++;
	}

	public void pop() {
		front = (front + 1) % arr.length;
		count--;
	}

	public int peek() {
		int index = (front + 1) % arr.length;
		return arr[index];
	}

	public boolean isEmpty() {
		return count == 0;

	}

	public boolean isFull() {
		return count == arr.length;
	}

}

public class CircularQueue {
	public static void main(String[] args) {
		CircularQ q = new CircularQ(3);
		if (!q.isFull())
			q.push(11);
		if (!q.isFull())
			q.push(22);
		if (!q.isFull())
			q.push(33);

		System.out.println("Element at front : " + q.peek() + "\n");

		while (!q.isEmpty()) {
			System.out.println("Popping: " + q.peek());
			q.pop();
		}

	}

}
