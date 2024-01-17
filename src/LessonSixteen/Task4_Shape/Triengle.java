package LessonSixteen.Task4_Shape;

public class Triengle implements Shape{

    private float a;
    private float b;
    private float c;

    public Triengle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float getPerimetr() {
        return a+b+c;
    }

    @Override
    public float getSuare() {
        float p = (a+b+c)/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }
}
