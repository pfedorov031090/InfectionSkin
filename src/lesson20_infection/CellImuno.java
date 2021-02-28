package lesson20_infection;

public class CellImuno extends CellHealth{

    public CellImuno(int x, int y, int interval) {
        super(x, y, interval);

    }

    public CellHealth next(){
        if (getInterval() < 4) {
            return new CellImuno(getX(), getY(), getInterval());
        }
        else {
            return new CellHealth(getX(), getY(), 0);
        }
    }

    public void run(){
        int z = getInterval();
        setInterval(z++);
    }

    public void print() {
        System.out.print(CellType.IMMUNITY);
    }

}
