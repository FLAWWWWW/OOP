package practice_04;

public class Game {
    public static void main(String args[]){
        Knight knight = new Knight(0, 0, 10, 5);
        Chest chest = new Chest(1, 1, 25, 5);
        Goblin goblin = new Goblin(0, 0, 10, 6);
        Rock rock = new Rock(0, 0);
        WoodenBox woodenBox = new WoodenBox(0, 0);

        knight.Damage(goblin);
        knight.Damage(goblin);

        knight.Push(chest, 1, -1);
        knight.Push(rock, -1, -1);
        knight.Push(woodenBox, -1, 1);

        knight.Damage(woodenBox);

        knight.Interact(chest);

        Knight evil_knight = new Knight(0, 0, 12, 6);

        evil_knight.Damage(knight);
    }
}
