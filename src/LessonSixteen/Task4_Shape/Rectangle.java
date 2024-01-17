package LessonSixteen.Task4_Shape;

public class Rectangle implements Shape{
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float getPerimetr() {
        return 2*(a+b);
    }

    @Override
    public float getSuare() {
        return a*b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}
