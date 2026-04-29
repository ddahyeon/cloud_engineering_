//다음과 같이 제공된 배열에서 최대값과 최소값을 구하는 코드 작성.
//   int [] score= {99,34,67,22,11,9};
import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = scan.nextInt();				

		int[] height = new int[num];			

		for (int i = 0; i < num; i++) {			
			height[i] = 100 + ran.nextInt(90);
			System.out.println("사람 " + (i+1)+": " + height[i]);
		}
		int max = height[0];
		for (int i = 1; i < height.length; i++)
			if (height[i] > max) {
				max = height[i];
			}
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
