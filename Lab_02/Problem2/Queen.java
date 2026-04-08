package Lab_02.Problem2;

public class Queen extends Piece {
    
    public Queen(Position position, boolean isWhite) {
        super(position, isWhite);
    }
    
    @Override
    public boolean isLegalMove(Position newPosition) {
        if (newPosition.equals(currentPosition)) return false;
        
        return isSameRowOrColumn(newPosition) || isDiagonal(newPosition);
    }
    
    public boolean isLegalMove(Position newPosition, Piece[][] board) {
        if (!isLegalMove(newPosition)) return false;
        
        return isStraightPathClear(newPosition, board);
    }
}