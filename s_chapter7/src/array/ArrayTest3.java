package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i=0;i<alpahbets.length;i++,ch++) {
			alpahbets[i] =ch;
		}
		
		for(int i=0;i<alpahbets.length;i++) {
			System.out.println(alpahbets[i]);
		}
	}

}
