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
		}else {
		returnToStart();
		turnAround();
		allWorldSolution();
		}
	}
	}	

/*
 * singleAvenueWorldSolution()
 * This is a one-off solution that basically rotates the allWorldSolution
 * 90 degs and manually applies it once
 */
private void singleAvenueWorldSolution() {	
	turnLeft();
	addCheckerboard();
}

/*
 * twoAvenueWorldSolution()s
 * Like the singleAvenueWorldSolution, we are rotating the allWorldSolution 
 * 90 degs and manually applying it to 
 */
private void twoAvenueWorldSolution() {
	turnLeft();
	move();
	allWorldSolution();
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







