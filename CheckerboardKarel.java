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
	while (frontIsClear() ) {
		gotoNextRow();
		addCheckerboard();
		returnToStart();
	}
}


/*
 * addCheckerboard()
 */

private void addCheckerboard() {
	putBeeper();
	if (frontIsClear() ) {
		move();
	}
	while (frontIsClear() ) {
		putBeeper();
		move();
		if (frontIsClear() ) {
			move();
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
	turnRight();
		
}

/*
 * gotoNextRow()
 */

private void gotoNextRow() {
	if (beepersPresent() ) {
		move();
		turnRight();
		
	}else {
		move();
		turnRight();
		move();
	}
}
}


