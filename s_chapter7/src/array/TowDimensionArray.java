package array;

public class TowDimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);

		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		char a = 'A'; // 알파벳 배열로 저장 
		char[][] alphabets = new char[13][2];
		for(int i=0;i<alphabets.length;i++) {
			for(int j=0;j<alphabets[i].length;j++,a++) {
				alphabets[i][j] = a;
				System.out.println(alphabets[i][j]);
			}
		}
		
	}

}
