package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private List<Car> cars = new ArrayList<>();

	public Cars() {
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public int getCarsSize() {
		return cars.size();
	}

	public Car getCar(int index) {
		return cars.get(index);
	}
}
