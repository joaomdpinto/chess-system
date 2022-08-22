package chess;

import boardgame.Board;
import chess.enums.Color;

public class ChessMatch {
	
	private Board board;
	/*private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;*/
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	/*public ChessMatch(Board board, int turn, Color currentPlayer, boolean check, boolean checkMate,
			ChessPiece enPassantVulnerable, ChessPiece promoted) {
		super();
		this.board = board;
		this.turn = turn;
		this.currentPlayer = currentPlayer;
		this.check = check;
		this.checkMate = checkMate;
		this.enPassantVulnerable = enPassantVulnerable;
		this.promoted = promoted;
	}*/
	
	public ChessPiece[][] getPieces(){
		
		ChessPiece[][] mat = new ChessPiece[this.board.getRows()][this.board.getRows()];
		
		for(int i=0; i<board.getRows();i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}

}
