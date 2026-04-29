

public class MyTest03 {

	public static void main(String[] args) {

		
		int n = 10;
		int n2 = 20;
		
		//값 변경 코드
		int temp = n;
		n = n2;
		n2 = temp;
		
		System.out.println("n값은 " + n);
		System.out.println("n2값은 " + n2);
		
		

	}
}
