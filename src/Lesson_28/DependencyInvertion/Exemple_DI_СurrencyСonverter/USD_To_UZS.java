package Lesson_28.DependencyInvertion.Exemple_DI_СurrencyСonverter;

public class USD_To_UZS implements СonverterСurrency {
    private double oneSom = 12012.23;
    @Override
    public double convert(double amount) {
        return amount*oneSom;
    }
}
