package pack03;
public class CarTest {

	public static void main(String args[]) {
		// Car type의 객체 배열을 2개 만든다
		Car cars[] = new Car[2];
		// 배열에 사용데이터에서 제공된 2개의 Car 객체를 넣는다.
		cars[0] = new L3("L3", "1500", 50, 25, 0);
		cars[1] = new L5("L5", "2000", 70, 35, 0);
		// 생성된 자동차의 기본 정보 출력
		System.out
				.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out
				.println("-----------------------------------------------------------");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] instanceof L3) {
				L3 l3 = (L3) cars[i];
				System.out.println(l3.getName() + "\t" + l3.getEngine() + "\t"
						+ l3.getOilTank() + "\t" + l3.getOilSize() + "\t"
						+ l3.getDistance() + "\t" + l3.getTempGage());
			} else {
				L5 l5 = (L5) cars[i];
				System.out.println(l5.getName() + "\t" + l5.getEngine() + "\t"
						+ l5.getOilTank() + "\t" + l5.getOilSize() + "\t"
						+ l5.getDistance() + "\t" + l5.getTempGage());
			}
		}
		System.out.println();
		System.out.println("25주유");
		System.out
				.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out
				.println("-----------------------------------------------------------");
		// 각각의 자동차에 25씩 주유 한다
		// 25씩 주유한 자동차의 정보를 출력 한다
		for (int j = 0; j < cars.length; j++) {
			cars[j].setOil(25);
			if (cars[j] instanceof L3) {
				L3 l3 = (L3) cars[j];
				System.out.println(l3.getName() + "\t" + l3.getEngine() + "\t"
						+ l3.getOilTank() + "\t" + l3.getOilSize() + "\t"
						+ l3.getDistance() + "\t" + l3.getTempGage());
			} else {
				L5 l5 = (L5) cars[j];
				System.out.println(l5.getName() + "\t" + l5.getEngine() + "\t"
						+ l5.getOilTank() + "\t" + l5.getOilSize() + "\t"
						+ l5.getDistance() + "\t" + l5.getTempGage());
			}
		}
		System.out.println();
		System.out.println("80주행");
		System.out
				.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out
				.println("-----------------------------------------------------------");
		// 각각의 자동차에 80씩 주행 한다
		// 80씩 주행한 정보를 출력 하며 엔진온도 정보를 출력 한다
		for (int k = 0; k < cars.length; k++) {
			cars[k].go(80);
			if (cars[k] instanceof L3) {
				L3 l3 = (L3) cars[k];
				System.out.println(l3.getName() + "\t" + l3.getEngine() + "\t"
						+ l3.getOilTank() + "\t" + l3.getOilSize() + "\t"
						+ l3.getDistance() + "\t" + l3.getTempGage());
			} else {
				L5 l5 = (L5) cars[k];
				System.out.println(l5.getName() + "\t" + l5.getEngine() + "\t"
						+ l5.getOilTank() + "\t" + l5.getOilSize() + "\t"
						+ l5.getDistance() + "\t" + l5.getTempGage());
			}
		}
	}
}
