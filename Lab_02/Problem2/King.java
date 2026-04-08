package Lab_02.Problem2;

public class King extends Piece {
    
    public King(Position position, boolean isWhite) {
        super(position, isWhite);
    }
    
    @Override
    public boolean isLegalMove(Position newPosition) {
        int xDiff = Math.abs(currentPosition.getX() - newPosition.getX());
        int yDiff = Math.abs(currentPosition.getY() - newPosition.getY());
        
        return xDiff <= 1 && yDiff <= 1 && !(xDiff == 0 && yDiff == 0);
    }
}