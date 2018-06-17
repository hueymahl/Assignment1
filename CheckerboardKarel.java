/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

public void run() {
	addCheckerboard();
	turnLeft()
	while (frontIsClear(() ) {
		gotoNextRow();
		addCheckerboard();
		checkForEnd();
	}
}

/*
 * addCheckerboard()
 */

private void addCheckerboard() {
	while (frontisClear() ) {
		putBeeper();
		move();
		if (frontisClear() ) {
			move();
		}
		putBeeper;
	}
}
}
