

public class Main{
    public static void main(String[] args){
        Vector2d vec2d_1 = new Vector2d(5, 6);
        Vector2d vec2d_2 = new Vector2d(1, 3);

        vec2d_1.get_diff(vec2d_2);
        vec2d_1.get_sum(vec2d_2);
        vec2d_1.get_mult(vec2d_2);
    }
}