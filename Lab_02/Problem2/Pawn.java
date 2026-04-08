package Lab_02.Problem2;

public class Pawn extends Piece {
    private boolean hasMoved = false;
    
    public Pawn(Position position, boolean isWhite) {
        super(position, isWhite);
    }
    
    @Override
    public boolean isLegalMove(Position newPosition) {
        int xDiff = newPosition.getX() - currentPosition.getX();
        int yDiff = Math.abs(newPosition.getY() - currentPosition.getY());
        
        // Direction depends on color
        int direction = isWhite ? 1 : -1;
        
        // Basic one square forward
        if (xDiff == direction && yDiff == 0) {
            hasMoved = true;
            return true;
        }
        
        // Two squares forward on first move
        if (!hasMoved && xDiff == 2 * direction && yDiff == 0) {
            hasMoved = true;
            return true;
        }
        
        // Capture diagonally
        if (xDiff == direction && yDiff == 1) {
            hasMoved = true;
            return true;
        }
        
        return false;
    }
    
    public boolean hasMoved() {
        return hasMoved;
    }
}