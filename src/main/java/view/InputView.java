package view;

import nextstep.utils.Console;

public class InputView {

	public String[] getCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		return Console.readLine().split(",");
	}

	public int getTrial() {
		System.out.println("시도할 회수는 몇회인가요?");
		return Integer.parseInt(Console.readLine());
	}
}
