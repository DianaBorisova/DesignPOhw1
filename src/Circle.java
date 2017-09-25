
public class Circle implements Figure {

    private final double r;

    public Circle(double r) throws Exception {
        if (r > 0) {
            this.r = r;
        } else {
            throw new Exception("Радиус не может быть меньше нуля");
        }
    }

    public double area() {
        return Math.pow(r,2)*Math.PI;
    }
}
