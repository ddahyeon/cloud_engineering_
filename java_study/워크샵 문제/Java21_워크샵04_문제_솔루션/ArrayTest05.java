
public class ArrayTest05 {
	public static void main(String[] args) {

		int[][] arr = { { 20, 30, 10 }, { 50, 40, 60 }, { 80, 80, 90 } };
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
