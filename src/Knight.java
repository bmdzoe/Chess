public class Knight extends Pieces{
    Type type;
    public Knight(int x, int y, String n){
        super(x, y, n);
        type = Type.KNIGHT;
    }
    @Override
    boolean IsValidPath(int finalx, int finaly) {
        return false;
    }
    @Override
    int[][] drawPath(int sx, int sy, int fx, int fy) {
        return new int[0][];
    }
    @Override
    public Type getType() {
        return type;
    }
}
// they move in an l-shape