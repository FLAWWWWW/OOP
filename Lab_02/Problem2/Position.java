package Lab_02.Problem2;

public class Position {
    private int x;
    private int y;
    
    public Position(int x, int y) {
        if (isValidPosition(x, y)) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException("Invalid position: (" + x + ", " + y + ")");
        }
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    private boolean isValidPosition(int x, int y) {
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        return x == position.x && y == position.y;
    }
}