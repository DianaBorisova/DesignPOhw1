
public class Quadrate implements Figure {

    private final double a;

    public Quadrate(double a) throws Exception {
        if (a > 0) {
            this.a = a;
        } else {
            throw new Exception("Сторона не может быть меньше нуля");
        }
    }

    public double area() {
        return Math.pow(a, 2);
    }
    }