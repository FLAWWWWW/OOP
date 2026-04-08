package Lab_02.Problem2;

public class Knight extends Piece {
    
    public Knight(Position position, boolean isWhite) {
        super(position, isWhite);
    }
    
    @Override
    public boolean isLegalMove(Position newPosition) {
        int xDiff = Math.abs(currentPosition.getX() - newPosition.getX());
        int yDiff = Math.abs(currentPosition.getY() - newPosition.getY());
        
        return (xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2);
    }
}