package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

	private List<RacingCar> racingCars = new ArrayList<>();

	public RacingCars() {
	}

	public void addRacingCar(RacingCar car) {
		racingCars.add(car);
	}

	public String getWinners(Cars cars) {
		int maxNumber = getMaxNumber(cars);
		return getWinners(cars, maxNumber);
	}

	private String getWinners(Cars cars, int maxNumber) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < racingCars.size(); i++) {
			Car car = cars.getCar(i);
			checkNumber(maxNumber, sb, i, car);
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	private void checkNumber(int maxNumber, StringBuilder sb, int i, Car car) {
		int number = getNumber(i, car);
		if (number == maxNumber) {
			sb.append(car.getName()).append(",");
		}
	}

	private int getNumber(int index, Car car) {
		return racingCars.get(index).getResult(car);
	}

	private int getMaxNumber(Cars cars) {
		int temp = 0;
		for (int i = 0; i < racingCars.size(); i++) {
			Car car = cars.getCar(i);
			int number = getNumber(i, car);
			temp = Math.max(temp, number);
		}
		return temp;
	}

	public RacingCar getRacingCar(int index) {
		return racingCars.get(index);
	}

}
