package system;
import boardgame.BoardException;

public class TicTacException extends BoardException{
	
	private static final long serialVersionUID = 1L;
	
	public TicTacException(String msg) {
		super(msg);
	}
}