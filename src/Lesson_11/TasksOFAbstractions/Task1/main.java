package Lesson_11.TasksOFAbstractions.Task1;

public class main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Circl circl = new Circl(3);
        System.out.println(rectangle.getPrimetr());
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getSideCount());
        System.out.println("");
        System.out.println(circl.getPrimetr());
        System.out.println(circl.getSquare());
        System.out.println(circl.getSideCount());
    }
}
