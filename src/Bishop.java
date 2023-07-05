public class Bishop extends Pieces{
    Type type;
    public Bishop(int x, int y, String n){
        super(x, y, n);
        type = Type.BISHOP;
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
// they can only move diagonaly and that's how they capture also