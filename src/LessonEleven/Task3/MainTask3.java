package LessonEleven.Task3;

public class MainTask3 {
    public static void main(String[] args) {
        AClass bclass = new BClass(2);
        AClass bclass1 = new BClass(2);
        System.out.println(bclass1.equals(bclass));
        System.out.println(bclass.equals(bclass1));
    }
}
