
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		int inputMoney = 1;
		int balance = 0;
		
		while (inputMoney != 0) {
			System.out.println("금액을 입력하세요 (종료는 -1) : ");
			inputMoney = VendingMachine.getUserInput();
			if(inputMoney==-1)break;
			System.out.println("투입금액:"+inputMoney+"원");
			balance +=  inputMoney;
			System.out.println("잔액:"+balance+"원");
			int inputMenu = 0;
			if (balance >= 800) {
				System.out.println("원하는 음료번호를 선택하세요(1.콜라(700원), 2.쥬스(800원), 3.생수(500원)) : ");
				inputMenu = VendingMachine.getUserInput();
				System.out.println((inputMenu==1?"콜라":inputMenu==2?"쥬스":"생수")+"가 배출되었습니다. 맛있게드세요.");
				balance -= inputMenu==1?700:inputMenu==2?800:500;
				System.out.println("잔액은 "+balance+"원 입니다.");
			}else if (balance >= 700) {
				System.out.println("원하는 음료번호를 선택하세요(1.콜라(700원), 3.생수(500원)) : ");
				inputMenu = VendingMachine.getUserInput();
				System.out.println((inputMenu==1?"콜라":"쥬스")+"가 배출되었습니다. 맛있게드세요.");
				balance -= inputMenu==1?700:800;
				System.out.println("잔액은 "+balance+"원 입니다.");
			}else if (balance >= 500) {
				System.out.println("원하는 음료번호를 선택하세요(3.생수(500원)) : ");
				inputMenu = VendingMachine.getUserInput();
				System.out.println("생수가 배출되었습니다. 맛있게드세요.");
				balance -= 500;
				System.out.println("잔액은 "+balance+"원 입니다.");
			}else{
				System.out.println("금액이 부족합니다.");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");

	}
	private static int getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}
