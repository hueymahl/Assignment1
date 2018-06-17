/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	public void run() {
		gotodoor();
		pickupnewspaper();
		returntostart();
	}
/*
 * Walks Karel to his door in fixed world
 */
	private void gotodoor() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	/*
	 * Karel picks up newspaper and turns around
	 */
	private void pickupnewspaper() {
		pickBeeper();
		turnAround();
	}
	/*
	 * Karel goes back to starting point
	 */
	private void returntostart() {
		
	}
}
