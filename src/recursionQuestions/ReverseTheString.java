package recursionQuestions;

public class ReverseTheString {
	public static String reverseString(String input) {
		// base condition
		if (input.equals(""))
			return "";

		// iteration
		return reverseString(input.substring(1)) + input.charAt(0);
	}

	public static void main(String[] args) {
		String s="hello world";
		System.out.println(reverseString(s));;
		

	}
}