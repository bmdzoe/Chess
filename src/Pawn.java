public class Pawn extends Pieces{
Type type;
    public Pawn(int x, int y, String n){
    super(x, y, n);
    type = Type.PAWN;
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
//pawns can only move up two the 1st move then forawrd once after that
//you can capture only diagonaly