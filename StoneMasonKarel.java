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
		gotoNextColumn();
	}

/*
 * fixColumn() should be used only after Karel has moved to the bottom
 * of a column. Once in place, he checks to see if a beeper is missing.
 * If one is, he replaces it. If one is not, he skips ahead until done
 */

private void fixColumn() {
	if (beepersPresent() ) {
		
	}
}
}