import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수 입력하세요.");
		int n = scan.nextInt();
		System.out.println("2.정수 입력하세요.");
		int n2 = scan.nextInt();
		
		System.out.printf("정수 %d 과  정수  %d 의 합계: %d" , n, n2 , (n+n2));
		
		scan.close();
	}
}
