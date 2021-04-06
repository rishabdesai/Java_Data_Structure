package searching;

public class HashCodeMain {

	public static int getHashCode(int element) {
		int result = 1;
		final int prime = 31;
		result = element * result + element * prime;
		return result;
	}

	public static void main(String[] args) {
		for(int count=1;count<=10;count++) {
			int element = count;
			int hashcode=getHashCode(element);
			int slot=hashcode%50;
			System.out.println(element+"    Hashcode ==>   "+slot);
		}
		
	}

}
