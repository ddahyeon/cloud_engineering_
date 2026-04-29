import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수 입력하세요.");
		int n = scan.nextInt();
		System.out.println("2.정수 입력하세요.");
		int n2 = scan.nextInt();
		System.out.println("3.정수 입력하세요.");
		int n3 = scan.nextInt();
		
		int max = (n>n2)?((n>n3)?n:n3):(n2>n3)?n2:n3;

		
		System.out.printf("정수 %d 과  정수  %d , 정수 %d 중에서  최대값: %d" , n, n2 , n3, max );
		
		scan.close();
	}
}
