package us.vlasov.cooking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cooking {
	
	enum Step {
		
		season(3),
		grill(4),
		bag(1),
		freeze(1),
		sous_vide(2);
		
		final int variations;
		
		Step(int variations) {
			this.variations = variations;
		}
	}
	
	/**
	 * Validates the sequence of steps
	 * @param steps
	 * @return
	 */
	private static boolean validate(List<Step> steps, Step nextStep) {		
		// Duplicate step
		if (steps.contains(nextStep)) {
			return false;
		}

		// No re-bagging - sous_vide includes/assumes bagging
		if (nextStep == Step.sous_vide && steps.contains(Step.bag)) {
			return false;  
		}
		
		if (nextStep == Step.bag && steps.contains(Step.sous_vide)) {
			return false;
		}
		
		// Freeze only in bags.
		if (nextStep == Step.freeze) {
			if (steps.isEmpty()) {
				return false;
			}
			Step lastStep = steps.get(steps.size() - 1);
			return lastStep == Step.sous_vide || lastStep == Step.bag;
		}
		
		// Bag for freezing, sous vide includes bagging.
		if (!steps.isEmpty()) {
			Step lastStep = steps.get(steps.size() - 1);
			if (lastStep == Step.bag && nextStep != Step.freeze) {
				return false;
			}
		}
		
		return true;
	}
	
	/** 
	 * Proceeds one step further in preparation applying constraints.
	 * Also includes NO-OP "step".
	 * @param steps
	 * @param remaining
	 * @return number of variations
	 */
	private static Set<List<Step>> proceed(List<Step> steps, int remaining) {
		if (remaining == 0) {
			return Collections.singleton(steps);
		}
		Set<List<Step>> ret = new HashSet<>();
		ret.addAll(proceed(new ArrayList<>(steps), remaining-1));
		for (Step step: Step.values()) {
			if (validate(steps, step)) {
				List<Step> newSteps = new ArrayList<>(steps);
				newSteps.add(step);
				ret.addAll(proceed(newSteps, remaining-1));
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		List<List<Step>> combinations = new ArrayList<>(proceed(new ArrayList<Step>(), Step.values().length));
		combinations.sort((a,b) -> a.size() - b.size());
		System.out.println(combinations.size());
		int total = 0;
		for (List<Step> combination: combinations) {
			System.out.println(combination);
			int variations = 1;
			for (Step cs: combination) {
				variations *= cs.variations;
			}
			total += variations;
		}
		System.out.println(total);
	}

}
