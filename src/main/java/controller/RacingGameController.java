package controller;

import domain.Car;
import domain.Cars;
import domain.RacingCar;
import domain.RacingCars;
import domain.Step;
import view.InputView;
import view.OutputView;

public class RacingGameController {

	InputView inputView = new InputView();
	OutputView outputView = new OutputView();
	Cars cars = new Cars();
	RacingCars racingCars = new RacingCars();
	int trial;

	private void play() {
		String[] names = inputView.getCarNames();
		getRacingCars(names);
		trial = inputView.getTrial();
	}

	private void getRacingCars(String[] names) {
		for (String name : names) {
			Car car = new Car(name);
			RacingCar racingCar = new RacingCar(car);
			addCar(car, racingCar);
		}
	}

	private void addCar(Car car, RacingCar racingCar) {
		cars.addCar(car);
		racingCars.addRacingCar(racingCar);
	}

	public void startGame() {
		try {
			play();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			play();
		}

	}

	public void finishGame() {
		outputView.printExecutionResult(cars, racingCars, trial);
		outputView.printWinner(cars, racingCars);
	}

}
