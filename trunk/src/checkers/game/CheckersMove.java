package checkers.game;

import games.Move;

/**
 * This is an implementation for the {@link Move} interface for a checkers game.
 * 
 * @author kreich
 */
public class CheckersMove implements Move {

	/**
	 * Constructor.
	 * @param from The square to move from.
	 * @param to The square to move to.
	 */
	public CheckersMove(long from, long to) {
		this.from = from;
		this.to = to;
	}
	
	/**
	 * @return The place to move from.
	 */
	public long getFrom() {
		return from;
	}
	
	/**
	 * @return The place to move to.
	 */
	public long getTo() {
		return to;
	}

	/** The square to move from. */
	private long from;
	
	/** The square to move to. */
	private long to;
	
}
