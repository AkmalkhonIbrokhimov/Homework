package Lesson_11.Task2.Abstract;

public class MainTask2 {
    public static void main(String[] args) {
        Shape treangle = new Triangle(2, 3, 5);
        Circle circle = new Circle(8);
        Shape rectangel = new Rectangle(3,2);
        System.out.println(treangle.getPerimtr());
        System.out.println(treangle.getArea());
        System.out.println(circle.getPerimtr());
        System.out.println(circle.getArea());
        System.out.println(rectangel.getPerimtr());
        System.out.println(rectangel.getArea());
    }
}
