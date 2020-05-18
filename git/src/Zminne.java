public class Zminne {
    private int x;
    private int y;
    private int pole = pole();
    int pole(){
        return x*y;
    }
    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Zminne(int x,int y){
        this.x=x;
        this.y=y;
        this.pole=pole();
    }

}
