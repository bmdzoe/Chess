public class Queen extends Pieces{
    Type type;
    public Queen(int x, int y, String n){
        super(x, y, n);
        type = Type.QUEEN;
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
// can only move in a squaure