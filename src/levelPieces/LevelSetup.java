package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	private int levelNum;
	private Drawable[] board;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	private int startLoc;

	
	public LevelSetup() {
		super();
		this.levelNum = 0;
		this.movingPieces = new ArrayList<Moveable>();
		this.interactingPieces = new ArrayList<GamePiece>();
		this.startLoc = 0;
		this.board = new Drawable[20];
	}
	
	public void createLevel(int num) {
		if (num==1) {
			this.levelNum = 1;
			this.startLoc = 4;
			this.board[1] = new Rock();
			this.board[11] = new Rock();
			Tiger tiggy = new Tiger(10);
			this.interactingPieces.add(tiggy);
			this.movingPieces.add(tiggy);
			this.board[10] = tiggy;
		} else if (num==2) {
			this.levelNum = 2;
			this.startLoc = 4;
		}
	}
	
	public Drawable[] getBoard() {
		return this.board;
	}
	
	public ArrayList<Moveable> getMovingPieces() {
		return this.movingPieces;
	}
	
	public ArrayList<GamePiece> getInteractingPieces() {
		return this.interactingPieces;
	}
	
	public int getPlayerStartLoc() {
		return this.startLoc;
	}
}
