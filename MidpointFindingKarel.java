/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * The solution works by first putting beacons on each corner
 * of First Street and then having Karel remove a beacon from alternating
 * ends until he reaches the middle. Once he reaches the middle, he marks
 * it with a beacon and retreats to the side of the world.
 * 
 * Note that this same process can be used to find the middle of the whole
 * by turning Karel vertical after he finds the horizontal midpoint and 
 * running, in order, map1stStreet(), removeEndBeepers() and markMidpoint().
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

public void run() {
	map1stStreet();
	removeEndBeepers();
	markMidpoint();
	
}

/*
 * map1stStreet() puts a beeper at each corner and then turns
 * Karel around so he is in position to work with the removeEndBeepers 
 * routine.
 */

private void map1stStreet() {
	while (frontIsClear() ) {
		putBeeper();
		move();
	}
	putBeeper();
	turnAround();
}

/*
 * removeEndBeepers() picks up the beeper up on one end and then moves Karel
 * to the other side.  This continues until there are no more beepers.
 */

private void removeEndBeepers() {
	while (beepersPresent() ) {
		pickBeeper();
		move();
		moveToOtherSide();	
	}
		
}

/*
 *moveToOtherSide() moves Karel to the other side of the beepers and positions
 *him on top of the last beeper in line.  Note the else statement is a special
 *use case that applies only the first time it is run (it picks up the beeper
 *at the corner of 1st Avenue and 1st Street). 
 */

private void moveToOtherSide() {
	while (beepersPresent() && frontIsClear() ) {
		move();
	}	
		if (noBeepersPresent() ) {
			turnAround();			
		}else {
			pickBeeper();
			turnAround();
		}
	move();
}

/*
 * markMidpoint() puts a beeper down once the midpoint has been found and
 * then moves karel off to the side.
 */

private void markMidpoint() {
	putBeeper();
	while (frontIsClear() ) {
		move();	
	}
	}
	
}
