public class Rook extends Pieces{
    Type type;
    public Rook(int x, int y, String n){
        super(x, y, n);
        type = Type.ROOK;
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
// they move in a plus shape