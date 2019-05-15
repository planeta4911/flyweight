import javax.swing.*;

public class App {

    static int SIZE = 1000;

    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        for (int i = 0; i < Math.floor(10000 / 3); i++) {
            showroom.buyCar(random(0, SIZE), random(0, SIZE),
                    "beetle", "src/beetle.png");
            showroom.buyCar(random(0, SIZE), random(0, SIZE),
                    "mini", "src/mini.png");
            showroom.buyCar(random(0, SIZE), random(0, SIZE),
                    "ferrari", "src/ferrari.png");
        }
        showroom.setSize(SIZE, SIZE);
        showroom.setResizable(false);
        showroom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showroom.setVisible(true);

        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + usedBytes/1024 + " Kb");



    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}