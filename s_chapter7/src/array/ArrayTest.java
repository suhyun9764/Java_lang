package array;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 1;
		numbers[2] = 1;
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		
		int[] studentIDs = new int[5];
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(studentIDs[i]);
		}
	}
}
