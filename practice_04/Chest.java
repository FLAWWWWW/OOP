package practice_04;

public class Chest extends OnSceneObject implements IInteractable, IPushable {
    private float exp;
    private int coins;

    public Chest(int pos_x, int pos_y, float exp, int coins){
        super(pos_x, pos_y);
        this.exp = exp;
        this.coins = coins;
    }

    public void interact(IInteractor interactor){
        System.out.println(String.format("You get %d coins, %.2f exp", coins, exp));
    }

    public void get_push_by_diraction(int x, int y){
        super.change_pos(pos_x + x, pos_y + y);
    }
}
