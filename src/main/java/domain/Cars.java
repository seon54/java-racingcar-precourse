package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	List<Car> cars = new ArrayList<>();

	public void addCar(Car car) {
		cars.add(car);
	}

	public int getCars() {
		return cars.size();
	}

	public List<String> getNames() {
		List<String> names = new ArrayList<>();
		for (Car car: cars) {
			names.add(car.getName());
		}
		return names;
	}
}
