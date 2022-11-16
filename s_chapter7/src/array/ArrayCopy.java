package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {10,20,30,40,50};
		
		System.arraycopy(arr1, 0, arr2, 1, 4);
		
		for(int i=0;i<arr1.length;i++) {
			
			System.out.println(arr1[i]);
		}

	}

}
