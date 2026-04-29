import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int num = scan.nextInt();
		
		int sum = 0;
		double n = 0;
		for(int i=1; i <= num; i++) {
			if(i%2==0) {
				System.out.println(i);
				sum += i;
				n++;
			}
		}
		System.out.println("총합:" + sum);
		System.out.println("평균값:" + sum/n);
		
		scan.close();
	}
}
