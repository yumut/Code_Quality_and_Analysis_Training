package com.findbugs.examples;

public class ScaryRankBugs {
	private String SOME_VALUE = "SomeValue";
	private String checkStrValue = null;

	public ScaryRankBugs() {
		this.checkStrValue = SOME_VALUE;
	}

	private void executeSomeConditions() {
		if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 1
		} else if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 2
		}
	}

	private static void incorrectAssignmentInIfCondition() {
	}
}
