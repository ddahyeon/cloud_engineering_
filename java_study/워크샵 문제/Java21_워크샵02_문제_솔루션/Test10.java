import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주소를 입력하시오.");
		String addr = scan.next();
		String addr2 = scan.next();
		String addr3 = scan.next();
		System.out.printf("도명: %s \n 시명: %s \n 구명: %s" , addr,addr2,addr3);
		
		scan.close();
	}
}
