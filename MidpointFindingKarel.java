/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * The solution works by first putting beacons on each corner
 * of First Street and then having Karel remove a beacon from alternating
 * ends until he reaches the middle. Once he reaches the middle, he marks
 * it with a beacon and retreats to the side of the world.
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
 * removeEndBeepers() picks up the beeper
 */
private void removeEndBeepers() {
	while (beepersPresent() ) {
		pickBeeper();
		move();
		moveToOtherSide();	
	}
		
}

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

private void markMidpoint() {
	putBeeper();
	while (frontIsClear() ) {
		move();	
	}
	}
	
}
