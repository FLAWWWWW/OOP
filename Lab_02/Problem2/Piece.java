package Lab_02.Problem2;

public abstract class Piece {
    protected Position currentPosition;
    protected boolean isWhite;
    
    public Piece(Position position, boolean isWhite) {
        this.currentPosition = position;
        this.isWhite = isWhite;
    }
    
    public abstract boolean isLegalMove(Position newPosition);
    
    public Position getCurrentPosition() {
        return currentPosition;
    }
    
    public boolean isWhite() {
        return isWhite;
    }
    
    protected boolean isStraightPathClear(Position newPosition, Piece[][] board) {
        if (!isSameRowOrColumn(newPosition)) return false;
        
        int x1 = currentPosition.getX();
        int y1 = currentPosition.getY();
        int x2 = newPosition.getX();
        int y2 = newPosition.getY();
        
        int xStep = Integer.compare(x2, x1);
        int yStep = Integer.compare(y2, y1);
        
        int x = x1 + xStep;
        int y = y1 + yStep;
        
        while (x != x2 || y != y2) {
            if (board[x-1][y-1] != null) return false;
            x += xStep;
            y += yStep;
        }
        
        return true;
    }
    
    protected boolean isSameRowOrColumn(Position newPosition) {
        return currentPosition.getX() == newPosition.getX() || 
               currentPosition.getY() == newPosition.getY();
    }
    
    protected boolean isDiagonal(Position newPosition) {
        int xDiff = Math.abs(currentPosition.getX() - newPosition.getX());
        int yDiff = Math.abs(currentPosition.getY() - newPosition.getY());
        return xDiff == yDiff;
    }
}