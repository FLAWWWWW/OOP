package Lab_03.Problem2;

public class Slime implements IMoveable {
    float pos_x;
    float pos_y;
    float speed;

    Slime(float speed, float pos_x, float pos_y){
         this.speed = speed;
         this.pos_x = pos_x;
         this.pos_y = pos_y;
    }

    @Override
    public void move(float x, float y) {
        pos_x += x * speed;
        pos_y += y * speed;
    }
}
