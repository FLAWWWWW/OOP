package practice_04;

public abstract class OnSceneObject {
    protected int pos_x;
    protected int pos_y;

    public OnSceneObject(int pos_x, int pos_y){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    protected void change_pos(int new_pos_x, int new_pos_y){
        System.out.println(String.format("Old pos (%d,%d)\nNew pos (%d,%d)", pos_x, pos_y, new_pos_x, new_pos_y));
        pos_x = new_pos_x;
        pos_y = new_pos_y;
    }

    protected void destroy(){
        System.out.println("Object destroyed");
    }
}
