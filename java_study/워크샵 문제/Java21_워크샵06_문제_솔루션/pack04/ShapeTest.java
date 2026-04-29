package pack04;
public class ShapeTest {

	public static void main(String[] args) {

		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		System.out.println("기존 정보");
		for (Shape obj : shape) {
			if (obj instanceof Triangle) {
				System.out.print("Triangle \t");
			} else {
				System.out.print("Rectangle \t");
			}
			System.out.println(obj.getArea() + " \t " + obj.getColors());
		}
		for (Shape obj : shape) {
			// obj에 저장된 실제 객체가 Resize의 자식이기도 하기 때문에,
			//아래와 같이 Casting 할 수 있다.
			Resize size = (Resize) obj;
			size.setResize(5);
		}
		System.out.println();
		System.out.println("사이즈를 변경 후 정보");
		for (Shape obj : shape) {
			if (obj instanceof Triangle) {
				System.out.print("Triangle \t");
			} else {
				System.out.print("Rectangle \t");
			}
			System.out.println(obj.getArea() + " \t " + obj.getColors());
		}
	}
}
