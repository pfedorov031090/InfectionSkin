package lesson20_infection;

public class Start {
    public Start() {
        Skin skin = new Skin();
        for (int i = 0; i < 15; i++) {
            for (int g = 0; g < skin.getSkin().length; g++) {
                for (int j = 0; j < skin.getSkin().length; j++) {
                    if (skin.getSkin()[g][j].getInterval() != 0 || (g == 10 && j == 10)) {
                        skin.getSkin()[g][j].run();
                    }
                }
            }
            skin.update();
            try {
                Thread.sleep(1000);
                skin.print();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
