package lesson20_infection;

public class CellHealth {
    private int x, y, interval;

    public CellHealth(int x, int y, int interval) {
        this.x = x;
        this.y = y;
        this.interval = interval;
    }

    public CellHealth() {
    }
    public void run(){
    }

    public CellHealth next(){
        return new CellHealth(x, y, 0);
    }

    public void print() {
        System.out.print(CellType.HEALTHY);
    }

    public int getInterval() {
        return interval;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
