package recursionQuestions;

public class DecimanToBinary {

	//option-1
	public static int decimalToBinary(int n) {
		if(n ==0)
			return 0;
		 return n%2 + 10*decimalToBinary(n/2);
	}

	//option-2
	public static String findBinary(int n, String result) {
		if(n==0)
			return result;
		result = n%2 + result;
		return findBinary(n/2, result);
	}
	
	public static void main(String[] args) {
		int result1 = decimalToBinary(15);
		System.out.println(result1);
		
		String result2 = findBinary(15, "");
		System.out.println(result2);
	}

}





