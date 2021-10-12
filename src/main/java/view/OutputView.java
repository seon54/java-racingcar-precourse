package view;

import static domain.Constant.*;

import domain.Car;
import domain.Cars;
import domain.RacingCars;
import domain.Step;
import nextstep.utils.Randoms;

public class OutputView {

	public void printExecutionResult(Cars cars, RacingCars racingCars, int trial) {
		for (int i = 0; i < trial; i++) {
			printCarExecution(cars, racingCars);
		}
	}

	private void printCarExecution(Cars cars, RacingCars racingCars) {
		for (int i = 0; i < cars.getCarsSize(); i++) {
			Car car = cars.getCar(i);
			Step step = racingCars.getRacingCar(i).getSteps(car);
			step.addRandomNumber(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
			System.out.println(car.getName() + " : " + step.getPrintResult());
		}
	}

	public void printWinner(Cars cars, RacingCars racingCars) {
		System.out.println("최종 우승자는 " + racingCars.getWinners(cars) + " 입니다.");
	}

}
