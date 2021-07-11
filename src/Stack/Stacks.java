package Stack;

import java.util.Scanner;

class Stack {
	private int[] arr;
	private int top;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int val) {
		top++;
		arr[top] = val;
	}

	public void pop() {
		top--;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

}

public class Stacks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, val;
		Stack s = new Stack(5);
		System.out.println("stack size is 5");
		do {
			System.out.print("\n 1.push\n2.pop\n3peek\n0exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(s.isFull())
					System.out.println("stack is full");
				else {
					System.out.println("enter value to add");
					val=sc.nextInt();
					s.push(val);
				}
				break;
			case 2:
				if(s.isEmpty())
					System.out.println("stack is empty");
				else {
					val = s.peek();
					s.pop();
					System.out.println("poped element is "+val);
				}
				break;
			case 3:
				if(s.isEmpty())
					System.out.println("stack is empty");
				else {
					val = s.peek();
					System.out.println("top most element is "+val);
				}
				break;
					
			}
		}while(choice !=0);
		sc.close();
		
	}
}
