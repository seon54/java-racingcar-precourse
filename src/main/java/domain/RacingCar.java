package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingCar {

	private final Map<Car, Steps> racingCarMap = new HashMap<>();

	private RacingCar() {}

	public RacingCar(Car car, Steps steps) {
		racingCarMap.put(car, steps);
	}

	public String getCarName() {
		return ((Car)racingCarMap.keySet().toArray()[0]).getName();
	}

	public List<Integer> getStepNumbers() {
		return ((Steps)racingCarMap.values().toArray()[0]).getStepNumbers();
	}
}
