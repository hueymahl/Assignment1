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
	returnToStart();
	gotoNextRow();
	while (frontIsClear() ) {
		turnRigh();
		addCheckerboard();
		returnToStart();
		gotoNextRow();
	}
}


/*
 * addCheckerboard()
 */

private void addCheckerboard() {
	putBeeper();
	
	while (frontIsClear() ) {
		move();
		if (frontIsClear() ) {
			move();
			putBeeper();
		}	
		}
	}

/*
 * returnToStart()
 */
	
private void returnToStart() {
	turnAround();
	while (frontIsClear() ) {
		move();
	}	
}

/*
 * gotoNextRow()
 */

private void gotoNextRow() {
	if (rightIsBlocked() ) {
		turnRight();
	}else {
		if (beepersPresent() ) {
			turnRight();
			move();
			if (rightIsClear() ) {
				turnRight();
				move();
				turnLeft();
			}else {
				if (frontIsClear() ) {
					move();
				}
			}
		}else {
		turnRight();
		move();
		}
	}
}

/*
 * checkEvenOdd()
 * 
 */

private void checkEvenOdd() {
	
}
}


