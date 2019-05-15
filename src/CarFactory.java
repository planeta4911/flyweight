import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    static Map<String, CarType> carTypes = new HashMap<>();

    public static CarType getCarType(String name, String path) {
        CarType result = carTypes.get(name);
        if (result == null) {
            result = new CarType(name, path);
            carTypes.put(name, result);
        }
        return result;
    }
}