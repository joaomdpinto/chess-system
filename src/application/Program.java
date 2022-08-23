package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			
			ChessPosition source = UI.ReadChessPosition(kb);
			
			System.out.println();
			System.out.print("Targe: ");
			
			ChessPosition target = UI.ReadChessPosition(kb);
			
			ChessPiece capturedPiece =  chessMatch.performChessMove(source, target);
		}
		
		//kb.close();
	}

}
