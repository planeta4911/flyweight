import java.awt.*;

public class Car {
    private int x;
    private int y;
    private CarType type;

    public Car(int x, int y, CarType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
