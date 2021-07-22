/*find power of number using recursion*/
package recursionQuestions;

public class PowerOfNumber {
	public static int powerOfNumber(int base, int exp) {
		if (exp < 0)
			return -1;

		if (exp == 0 || exp == 1)
			return base;
		return base * powerOfNumber(base, exp - 1);
	}

	public static void main(String[] args) {

		int result = powerOfNumber(2, 2);
		System.out.println(result);
	}

}
