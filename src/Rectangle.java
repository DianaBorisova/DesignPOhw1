
public class Rectangle implements Figure {

    private final double a;

    private final double b;

    public Rectangle(double a, double b) throws Exception {
        if (a > 0 && b >0 ) {
            this.a = a;
            this.b = b;
        } else {
            throw new Exception("Сторона не может быть меньше нуля");
        }
    }

    public double area() {
        return a*b;
    }
   }
