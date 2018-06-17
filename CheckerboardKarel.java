/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * CheckerboardKarel has one universal solution (allWorldSolution()) and
 * two edge cases, singleAvenue.
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
 * 90 degs and manually applying it.  We start with it offset on corner so
 * the final solution has a beeper in position 1x1
 */
private void twoAvenueWorldSolution() {
	turnLeft();
	move();
	allWorldSolution();
}
/*
 * allWorldSolution()
 * After elimination of the two edge cases (singleAvenue and twoAvenue)
 * allWold adds a checkerboard stret0by-street.  To keep orientation,
 * it resets Karel on the far left after each street is complete
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
 * addCheckerboard will always place a beeper where Karel starts. It will
 * then move forward twice and add another beeper, so long as the front is
 * clear.
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
 * This simply moves Karel back to the beginning of the street where Karel
 * started.
 */
	
private void returnToStart() {
	turnAround();
	while (frontIsClear() ) {
		move();
	}	
}

/*
 * gotoNextRow()
 * This is a nested conditional tree.
 * The first condition tests if the world has ended. If so, Karel spins
 * around in victory (also leaving Karel in direction orignally pointed 
 * to kill the while loop).
 * The second condition is designed to offset the start of the next 
 * addCheckerboard routine so the beepers are properly lined up.
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







