

// import src.*;
import java.util.List;

// import src.AreaCalculator;
// import src.Circle;
// import src.Squar;
public class AreaCal {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Squar squar = new Squar(10);
        List<Object> shape = List.of(circle, squar);
        int sum =  areaCalculator.sum(shape);
        System.out.println("Sum = "+ sum);
    }
}
