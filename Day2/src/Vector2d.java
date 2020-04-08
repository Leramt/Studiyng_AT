public class Vector2d extends AbstractVector{
    private int x, y;


    public Vector2d(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public void get_sum(AbstractVector abstractVector) {
            Vector2d vector2d_2 = (Vector2d)abstractVector;
            int sum_x = x + vector2d_2.x;
            int sum_y = y + vector2d_2.y;
            System.out.println("The sum of two Vector2d is " + sum_x + ";" + sum_y);
    }

    @Override
    public void get_diff(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        int diff_x = x - vector2d_2.x;
        int diff_y = y - vector2d_2.y;
        System.out.println("The difference of two Vector2D is " + diff_x + ";" + diff_y);
    }

    @Override
    public void get_mult(AbstractVector abstractVector) {
            Vector2d vector2d_2 = (Vector2d)abstractVector;
            int mult = (x * vector2d_2.x) + (y * vector2d_2.y);
            System.out.println("The miltiplication of Vector2D is " + mult);
    }
}
