package recursionQuestions;

public class Fibonacci {
	
	public static long fib(long n) {
		if(n==0 || n==1)
			return n;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		long result = fib(10);
		System.out.println(result);
	}

}
