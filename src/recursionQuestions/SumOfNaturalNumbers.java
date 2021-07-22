package recursionQuestions;

public class SumOfNaturalNumbers {
	public static int recSum(int n) {
		if(n <=1)
			return n;
		return n + recSum(n-1);
	}

	public static void main(String[] args) {
		int result = recSum(10);
		System.out.println(result);
			
	}

}
