import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class CarType {
    private String name;
    private String path;
    private Image image;

    public CarType(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public void draw(Graphics g, int x, int y) {
        try
        {
            image = ImageIO.read(new File(path));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        g.drawImage(image, x, y, null);
    }
}
