package Lesson_28_29.DependencyInvertion.Exemple_DI_СurrencyСonverter;

public class Main {
    public static void main(String[] args) {
        User user = new User(101254,new USD_To_UZS());
        System.out.println(user.convert());
        User user1 = new User(101254,new UZS_To_USD());
        System.out.println(user1.convert());
    }
}
