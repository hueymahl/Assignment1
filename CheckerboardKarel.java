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
	if(frontIsBlocked() ) {
		singleAvenueWorldSolution();	
	}else {
		move();
		if (frontIsBlocked() ) {
			twoAvenueWorldSolution();
		}else
		returnToStart();
		turnAround();
		allWorldSolution();
	}
	}	

/*
 * singleAvenueWorldSolution()
 */
private void singleAvenueWorldSolution() {	
	turnLeft();
	addCheckerboard();
}

/*
 * twoAvenueWorldSolution()
 */
private void twoAvenueWorldSolution() {
	turnLeft();
	addCheckerboard();
	turnRight();
	move();
	if (rightIsClear() ) {
		turnRight();
		move();
		addCheckerboard();
	}
}
/*
 * allWorldSolution()
 */

private void allWorldSolution() {
	while (frontIsClear() ) {
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
		turnAround();
		turnAround();
	}else {
	if (beepersPresent() ) {
		turnRight();
		move();
		turnRight();
		move();
	}else {
		turnRight();
		move();
		turnRight();
	}
	}
}

}







