/* How to find sum of digits of a positive integer number using recursion
 */

package recursionQuestions;

public class FindSumOfDigits {
	public static int sumofdigits(int n) {
		if (n == 0 || n < 0)
			return 0;
		return n % 10 + sumofdigits(n / 10);
	}

	public static void main(String[] args) {
		int result = sumofdigits(111);
		System.out.println(result);
	}

}
