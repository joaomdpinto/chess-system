package chess;

import boardgame.Board;
import chess.enums.Color;
import chess.pieces.King;
import chess.pieces.Rook;

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
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column,row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}

}
