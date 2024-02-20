package Lesson_28.DependencyInvertion.Exemple_DI_СurrencyСonverter;

public class UZS_To_USD implements СonverterСurrency {
    private double oneDollar = 10234.12;
    @Override
    public double convert(double amount) {
        return amount/oneDollar;
    }
}
