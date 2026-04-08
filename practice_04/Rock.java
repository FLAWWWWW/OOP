package practice_04;

public class Rock extends OnSceneObject implements IPushable {

    public Rock(int pos_x, int pos_y){
        super(pos_x, pos_y);
    }

    public void get_push_by_diraction(int x, int y){
        super.change_pos(pos_x + x, pos_y + y);
    }
}
