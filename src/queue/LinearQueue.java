//linear queue is not recommended to use

package queue;

class LinearQ{
	private int[] arr;
	private int front, rear;
	
	public LinearQ(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public void push(int val) {
		 rear++;
		 arr[rear]=val;
	}
	
	public void pop() {
		front++;
	}
	
	public int peek() {
		return arr[front+1];
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return rear==arr.length-1;
	}
}

public class LinearQueue {
	
public static void main(String[] args) {
	LinearQ q = new LinearQ(3);
	if(!q.isFull())
		q.push(11);
	if(!q.isFull())
		q.push(22);
	if(!q.isFull())
		q.push(33);
	
	System.out.println("Element at front : " + q.peek() + "\n");
	
	while(!q.isEmpty()) {
		System.out.println("Popping: " + q.peek());
		q.pop();

	}
	}

}
