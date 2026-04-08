package Lab_02.Problem2;

public class Problem {
    public static void main(String[] args) {
        Rook rook = new Rook(new Position(1, 1), true);
        System.out.println("Rook at (1,1)");
        System.out.println("Can move to (1,5): " + rook.isLegalMove(new Position(1, 5)));
        System.out.println("Can move to (3,1): " + rook.isLegalMove(new Position(3, 1)));
        System.out.println("Can move to (3,3): " + rook.isLegalMove(new Position(3, 3)));
        
        King king = new King(new Position(4, 4), true);
        System.out.println("\nKing at (4,4)");
        System.out.println("Can move to (4,5): " + king.isLegalMove(new Position(4, 5)));
        System.out.println("Can move to (5,5): " + king.isLegalMove(new Position(5, 5)));
        System.out.println("Can move to (6,4): " + king.isLegalMove(new Position(6, 4)));
        
        Queen queen = new Queen(new Position(4, 4), true);
        System.out.println("\nQueen at (4,4)");
        System.out.println("Can move to (4,7): " + queen.isLegalMove(new Position(4, 7)));
        System.out.println("Can move to (7,7): " + queen.isLegalMove(new Position(7, 7)));
        System.out.println("Can move to (5,6): " + queen.isLegalMove(new Position(5, 6)));
        
        Bishop bishop = new Bishop(new Position(4, 4), true); // Слон
        System.out.println("\nBishop at (4,4)");
        System.out.println("Can move to (6,6): " + bishop.isLegalMove(new Position(6, 6)));
        System.out.println("Can move to (2,2): " + bishop.isLegalMove(new Position(2, 2)));
        System.out.println("Can move to (4,5): " + bishop.isLegalMove(new Position(4, 5)));
        
        Knight knight = new Knight(new Position(4, 4), true); // Конь
        System.out.println("\nKnight at (4,4)");
        System.out.println("Can move to (6,5): " + knight.isLegalMove(new Position(6, 5)));
        System.out.println("Can move to (5,6): " + knight.isLegalMove(new Position(5, 6)));
        System.out.println("Can move to (5,5): " + knight.isLegalMove(new Position(5, 5)));
        
        Pawn pawn = new Pawn(new Position(2, 4), true);
        System.out.println("\nWhite Pawn at (2,4)");
        System.out.println("Can move to (3,4): " + pawn.isLegalMove(new Position(3, 4)));
        
        Pawn pawn2 = new Pawn(new Position(2, 4), true);
        System.out.println("\nNew white Pawn at (2,4)");
        System.out.println("First move to (4,4): " + pawn2.isLegalMove(new Position(4, 4)));
    }
}