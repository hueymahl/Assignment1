/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass "fixes" broken columns in a world.  
 * Karel always starts in Row 1, Avenue 1.  Ave
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
 * fixColumn() should be used only after Karel has moved to the bottom
 * of a column. Once in place, he checks to see if a beeper is missing.
 * If one is, he replaces it. If one is not, he skips ahead until done
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
 * fixing that column.  Should only be run after fixColumn. It leaves
 * Karel facing to the right so that the first "while (frontIsClear() )"
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
 */	

private void gotoNextColumn() {
	for (int i = 0; i < 4; i++) {
		move();
	}
}
}