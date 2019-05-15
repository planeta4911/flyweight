import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Showroom extends JFrame {
    private List<Car> cars = new ArrayList<>();

    public void buyCar(int x, int y, String name, String path) {
        CarType type = CarFactory.getCarType(name, path);
        Car car = new Car(x, y, type);
        cars.add(car);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Car car : cars) {
            car.draw(graphics);
        }
    }
}
