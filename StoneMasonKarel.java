/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
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
	turnLeft();
	if (beepersPresent() ) {
		if (frontIsClear() ) {
		move();
		}
	}else {putBeepers();
	while (frontIsClear() ) {
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