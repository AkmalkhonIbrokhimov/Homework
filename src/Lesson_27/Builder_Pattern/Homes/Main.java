package Lesson_27.Builder_Pattern.Homes;

public class Main {
    public static void main(String[] args) {
        HomeDirector director = new HomeDirector();
        ConcreatHomeBuilder builder = new ConcreatHomeBuilder();
        ConcreatHomeBuilder builder1 = new ConcreatHomeBuilder();

        director.createApartment(builder);
        director.createVilla(builder1);
        Home home =builder.build();
        Home home1 =builder1.build();
        System.out.println(home);
        System.out.println(home1);

    }
}
