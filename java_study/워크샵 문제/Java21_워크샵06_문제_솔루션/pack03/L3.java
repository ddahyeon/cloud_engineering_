package pack03;
public class L3 extends Car implements Temp {
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	public void go(int distance) {
		setOilSize(getOilSize() - (distance / 10));
		setDistance(distance);
	}
	public void setOil(int oilSize) {
		setOilSize(getOilSize() + oilSize);
	}
	public int getTempGage() {
		return getDistance() / 10;
	}
}
