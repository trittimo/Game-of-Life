import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * This class represents the game board. It can draw a graphical rendering of
 * its current state and can calculate its next state.
 * 
 * @author TODO 0: [YOUR NAMES HERE]. Created Sep 24, 2008.
 */
public class GameOfLife extends JComponent {
	private static final int MAX_ROWS = 90;
	private static final int MAX_COLUMNS = 90;
	private static final double DOT_SIZE = 7;

	/*
	 * TODO 1: Decide how you'll represent the state of the game board. That is, what field(s)
	 * do you need?
	 */

	/**
	 * Constructs a new game board from the list of initially occupied
	 * coordinates.
	 * 
	 * @param initialCells
	 */
	public GameOfLife(ArrayList<Cell> initialCells) {
		/*
		 * TODO 2: Document, test, and implement this constructor that takes an
		 * ArrayList<Coordinates> specifying all the initially occupied squares
		 * on the game board. The Coordinates class is provided. NOTE: You will
		 * probably need a "smart" constructor.  Instead of just storing
		 * initialCells, you'll need to convert to whatever representation you
		 * chose in the previous to-do item.
		 */
	}

	/**
	 * @param row
	 * @param column
	 * @return whether or not the square in the given row and column is occupied
	 */
	public boolean isOccupied(int row, int column) {
		/*
		 * TODO 4: Document, test, and implement this method that detects whether
		 * a particular square is occupied.
		 */
		return false;
	}

	/**
	 * Counts the number of occupied cells around the given square.
	 * 
	 * @param row
	 * @param column
	 * @return the number of occupied cells
	 */
	public int getNeighborCount(int row, int column) {
		/*
		 * TODO 5: Document, test, and implement this method that takes a row and
		 * column and returns the number of occupied neighbor squares.
		 */
		return 0;
	}

	/**
	 * Updates the state of this game board for the next generation.
	 */
	public void nextGeneration() {
		/*
		 * TODO 6: Document, test, and implement this method that calculates the
		 * occupied squares for the next generation of this game. See p. 332 of
		 * Big Java, or the class slides for the rules. You'll need to use
		 * temporary storage to hold the next generation information as you
		 * calculate it.
		 */
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		/*
		 * TODO 3: Implement this method to draw the game board.  You don't have to 
		 * draw the grid if you don't want, just the occupied cells.
		 */	
	}

}
