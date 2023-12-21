package LessonEleven.Task2.Iterface;

public class MainInterface {
    public static void main(String[] args) {

        Shape tringle = new Triangle(2,3,4);
        System.out.println(tringle.getPerimetr());
        System.out.println(tringle.getArea());
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getArea());
        Circle circle =new Circle(5);
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getArea());
    }
}
