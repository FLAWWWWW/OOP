package Lab_02.Problem2;

public class Rook extends Piece {
    
    public Rook(Position position, boolean isWhite) {
        super(position, isWhite);
    }
    
    @Override
    public boolean isLegalMove(Position newPosition) {
        if (newPosition.equals(currentPosition)) return false;
        
        return isSameRowOrColumn(newPosition);
    }
    
    public boolean isLegalMove(Position newPosition, Piece[][] board) {
        if (!isLegalMove(newPosition)) return false;
        
        return isStraightPathClear(newPosition, board);
    }
}