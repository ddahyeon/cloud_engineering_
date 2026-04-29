package pack05;

public class Calc {
	public int calcuate(int data) {
		int total = 0;
		for (int i = 1; i <= data; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		return total;
	}
}