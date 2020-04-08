public class Vector2d extends AbstractVector{
    int x;
    int y;

    public Vector2d(int x,int y){
        this.x=x;
        this.y=y;
    }


    @Override
    public void get_sum(AbstractVector abstractVector) {
            Vector2d vector2d_2 = (Vector2d)abstractVector;
            int sum_x = x + vector2d_2.x;
            int sum_y = y + vector2d_2.y;
            System.out.println("The sum is " + sum_x + " ; " + sum_y);
    }

    @Override
    public void get_diff(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        int diff_x = x - vector2d_2.x;
        int diff_y = y - vector2d_2.y;
        System.out.println("The difference is " + diff_x + " ; " + diff_y);
    }

    @Override
    public void get_mult(AbstractVector abstractVector) {
            Vector2d vector2d_2 = (Vector2d)abstractVector;
            int mult = (x * vector2d_2.x) + (y * vector2d_2.y);
            System.out.println("The miltiplication is " + mult);
    }
}
