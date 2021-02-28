package lesson20_infection;

public class Skin {
    private static CellHealth[][] skin;

    public Skin() {
        skin = new CellHealth[22][22];
        for (int i = 0; i < skin.length; i++) {
            for (int j = 0; j < skin.length; j++) {
                skin[i][j] = new CellHealth(i, j, 0);
            }
        }
        skin[10][10] = new CellIll(10, 10, 0);
    }

    public CellHealth[][] getSkin() {
        return skin;
    }

    public void print () {
        for (int i = 0; i < skin.length; i++) {
            for (int j = 0; j < skin.length; j++) {
                skin[i][j].print();
            }
            System.out.println();
        }
    }

    //должен вызывать метод next у всех ячеек
    public void update(){
        for (int g = 0; g < skin.length; g++) {
            for (int j = 0; j < skin.length; j++) {
                if (skin[g][j].getInterval() != 0 || (g == 10 && j == 10)) {
                    skin[g][j] = skin[g][j].next();
                }
            }
        }
    }

    public static CellHealth getCell (int x, int y) {
        return skin[x][y];
    }

    public static void setCell (int x, int y, CellHealth cell) {
        skin[x][y] = cell;
    }
}
