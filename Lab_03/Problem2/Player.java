package Lab_03.Problem2;

public class Player implements IMoveable, IFasheable{
    float pos_x;
    float pos_y;
    float speed;
    float stamina;
    float stamina_modifier;
    boolean isFlashing;

    Player(float pos_x, float pos_y, float speed, float stamina, float stamina_modifier){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.speed = speed;
        this.stamina = stamina;
        this.stamina_modifier = stamina_modifier;
        isFlashing = false;
    }

    @Override
    public void reduceStamina() {
        stamina -= stamina*stamina_modifier;
    }

    @Override
    public void refuel(float amount) {
        stamina += stamina*stamina_modifier;
    }

    @Override
    public boolean hasEnoughStamina() {
        if(stamina <= 0) return false;
        return true;
    }

    @Override
    public void Flash(float x, float y) {
        if(hasEnoughStamina()){
            pos_x += x * speed;
            pos_y += y * speed;
            // Получаем двойную прибавку к перемещению
            reduceStamina();
        }
    }

    @Override
    public void move(float x, float y) {
        if(isFlashing) Flash(x, y);
        pos_x += x * speed;
        pos_y += y * speed;
    }
    
}
