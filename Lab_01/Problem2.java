package Lab_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Enemy enemy = new Enemy(EnemyType.CloseDist, 10, 15);

        Spawner.AddEnemy(enemy);
        Spawner.SpawnEnemy();
    }
}

class Spawner{
    static ArrayList<Enemy> enemies = new ArrayList<Enemy>();

    static void AddEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    static void SpawnEnemy(){
        for (Enemy enemy : enemies) {
            enemy.Spawn();
        }
    }
}

enum EnemyType{
    LongDist,
    CloseDist
}

class Enemy {
    EnemyType type;
    int x_pos;
    int y_pos;
    final double speed = 0.5;
    double multiplier;

    Enemy(){ }

    Enemy(EnemyType type, int x_pos, int y_pos){
        this.type = type;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    void Spawn(){
        System.out.println(String.format("Enemy spawned at: x: %d y: %d", x_pos, y_pos));
    }
}