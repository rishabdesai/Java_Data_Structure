/* find factorial of number using recursion */
package recursionQuestions;

public class FindFactorial {

	public static int findFactorial(int n) {
		if (n < 0)
			return -1;
		if (n == 1 || n == 0)
			return 1;
		return n * findFactorial(n - 1);
	}

	public static void main(String[] args) {
		int result = findFactorial(3);
		System.out.println(result);

	}

}
