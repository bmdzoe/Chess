public class King extends Pieces{
    Type type;
    public King(int x, int y, String n){
        super(x, y, n);
        type = Type.KING;
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
// moves like a rook and a bishop combined