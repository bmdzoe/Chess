abstract class Pieces {
    public int positionx;
    public int postiony;
    public String name;
    public Pieces(int x, int y,String n){
        x = positionx;
        y = postiony;
        n = name;
    }
    public int getPositionx() {
        return positionx;
    }
    public void setPositionx(int px) {
        px = positionx;
    }
    public int getPostiony(){
        return postiony;
    }
    public void setPostiony(int py){
        py = postiony;
    }
    public void setname(String n){
        n = name;
    }
    public String getName(){
        return name;
    }
    abstract boolean IsValidPath(int finalx, int finaly);
    abstract int [][]drawPath(int sx, int sy, int fx, int fy);
    public abstract Type getType();
}
