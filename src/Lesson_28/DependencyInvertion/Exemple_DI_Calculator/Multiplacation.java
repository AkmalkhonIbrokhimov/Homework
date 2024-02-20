package Lesson_28.DependencyInvertion.Exemple_DI_Calculator;

public class Multiplacation implements CalculatorOperation{
    @Override
    public double calculate(double firstNumbaer, double secondNumber) {
        return firstNumbaer*secondNumber;
    }
}
