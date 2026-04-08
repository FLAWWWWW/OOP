package practice_04;

public class WoodenBox extends OnSceneObject implements IDamageable, IPushable {

    public WoodenBox(int pos_x, int pos_y){
        super(pos_x, pos_y);
    }

    public void getDamage(float damage){
        System.out.println("Wooden Box gets damage!");
        super.destroy();
    }

    public void get_push_by_diraction(int x, int y){
        super.change_pos(pos_x + x, pos_y + y);
    }
}
