package lesson20_infection;

public class CellIll extends CellHealth{


    public CellIll(int x, int y, int interval) {
       super(x, y, interval);
    }


    public CellHealth next(){
        if (getInterval() < 6) {
            return new CellIll(getX(), getY(), getInterval());
        }
        else {
            return new CellImuno(getX(), getY(), -1);
        }
    }

    public void print() {
        System.out.print(CellType.INFECTED);
    }

    public void run(){
        int z = getInterval();
        int step = 0;
        int[] arr = moove(getX(), getY());
        while (Skin.getCell(arr[0], arr[1]).getClass() != CellHealth.class || step < 10) {
            arr = moove(getX(), getY());
            step++;
        }
        int rnd = (int) (Math.random() * 2);
        if (rnd == 1) {
            if (Skin.getCell(arr[0], arr[1]).getClass() == CellHealth.class) {
                Skin.setCell(arr[0], arr[1], new CellIll(arr[0], arr[1], 0));
                setInterval(z++);
            }
        }
        setInterval(z++);
    }

    public int[] moove (int x, int y) {
        int rnd = (int)(Math.random() * 8 + 1);
        int[] coord = new int[2];
        switch (rnd) {
            case 1: {
                coord[0] = x - 1;
                coord[1] = y;
                break;
            }
            case 2: {
                coord[0] = x - 1;
                coord[1] = y - 1;
                break;
            }
            case 3: {
                coord[0] = x;
                coord[1] = y - 1;
                break;
            }
            case 4: {
                coord[0] = x + 1;
                coord[1] = y - 1;
                break;
            }
            case 5: {
                coord[0] = x + 1;
                coord[1] = y;
                break;
            }
            case 6: {
                coord[0] = x + 1;
                coord[1] = y + 1;
                break;
            }
            case 7: {
                coord[0] = x;
                coord[1] = y + 1;
                break;
            }
            case 8: {
                coord[0] = x - 1;
                coord[1] = y + 1;
                break;
            }
        }
        return coord;
    }

}
