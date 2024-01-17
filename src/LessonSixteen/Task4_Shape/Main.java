package LessonSixteen.Task4_Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Triengle(2,4,5);
        System.out.println("Uchburchak perimetri := " + shape.getPerimetr());
        System.out.println("Uchburchak maydoni := " + shape.getSuare());
        Rectangle rectangle = new Rectangle(12F,3.6F);
        System.out.println("To'rtburchak perimetri := " + rectangle.getPerimetr());
        System.out.println("To'rtburchak maydoni := " + rectangle.getSuare());

    }
}
