package domain;

import java.util.ArrayList;
import java.util.List;

public class Steps {

	List<Step> steps = new ArrayList<>();

	public void addStep(Step step) {
		steps.add(step);
	}

	public List<Integer> getStepNumbers() {
		List<Integer> numbers = new ArrayList<>();
		for (Step step: steps) {
			numbers.add(step.getNumber());
		}
		return numbers;
	}
}
