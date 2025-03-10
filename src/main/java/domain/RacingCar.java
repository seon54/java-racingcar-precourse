package domain;

import java.util.HashMap;
import java.util.Map;

public class RacingCar {

	private Map<Car, Step> map = new HashMap<>();

	public RacingCar() {
	}

	public RacingCar(Car car) {
		map.put(car, new Step());
	}

	public void setMap(Car car, Step steps) {
		map.put(car, steps);
	}

	public Step getSteps(Car car) {
		return map.get(car);
	}

	public int getResult(Car car) {
		return map.get(car).getResultNumber();
	}
}
