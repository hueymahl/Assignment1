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
	whichWorld();
	if(frontIsBlocked() ) {
		turnLeft();
		addCheckerboard();
	}else
		addCheckerboard();
		returnToStart();
		gotoNextRow();
		turnRight();
	while (frontIsClear() ) {
		addCheckerboard();
		returnToStart();
		gotoNextRow();
		turnRight();
	}
}

/*
 * whichWorld()
 */
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
		turnAround();
		turnAround();
	}else {
		if (beepersPresent() ) {
			turnRight();
			move();
			if (rightIsClear() ) {
				turnRight();
				move();
				turnLeft();
			}
		}else {
			turnRight();
			move();
			}
			}
}
}




