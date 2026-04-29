package pack02;
public class Otab extends Mobile {
	public Otab() {
	}
	// 초기값으로 설정
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	// 변경된 배터리 값 Mobile에 설정 및 가져오기
	// batterySize 가 private 이기 때문에 직접 접근 불가.
	public int operate(int time) {
		setBatterySize(getBatterySize() - (time * 12));
		return getBatterySize();
	}
	// 변경된 배터리 값 Mobile에 설정 및 가져오기
	public int charge(int time) {
		setBatterySize(getBatterySize() + (time * 8));
		return getBatterySize();
	}
}

