package Lesson_28_29.DependencyInvertion.Exemple_DI_СurrencyСonverter;

public class User {
    private double amount;
    private СonverterСurrency сonverterСurrency;

    public User(double amount, СonverterСurrency сonverterСurrency) {
        this.amount = amount;
        this.сonverterСurrency = сonverterСurrency;
    }
    public double convert(){
        return сonverterСurrency.convert(this.amount);
    }
}
