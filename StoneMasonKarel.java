/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass "fixes" broken columns in a world.  
 * Karel always starts in first street, facing east, on Avenue 1.  
 * Avenue 1 always has a column to fix.  If there are other columns, 
 * they are exactly 4 units apart.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		fixColumn();
		returnToBottom();
		while (frontIsClear() ) {
			gotoNextColumn();
			fixColumn();
			returnToBottom();
		}	
	}

/*
 * fixColumn() should be used at the start or after Karel has moved to the bottom
 * of a column. Once in place, he checks to see if a beeper is missing.
 * If one is, he replaces it. If one is not, he turns left and then replaces missing 
 * beacons until he reaches the top.
 */

private void fixColumn() {
	if (noBeepersPresent() ) {
		putBeeper();
	}
	turnLeft();
	{while (frontIsClear() ) {
		move();
		if (noBeepersPresent() ) {
			putBeeper();
			}
		}
		}
}	
/*
 * returnToBottom() moves Karel back to the bottom of a column after
 * fixing that column.  Should only be run after fixColumn(). It leaves
 * Karel facing east so that the "while (frontIsClear() )"
 * can be checked.
 */	

private void returnToBottom() {
	turnAround();
	while (frontIsClear() ) {
		move();
	}
	turnLeft();
	
}
/*
 * gotoNextColumn() moves Karel to the next column.  
 * Use only after returnToBottom().
 */	

private void gotoNextColumn() {
	for (int i = 0; i < 4; i++) {
		move();
	}
}
}