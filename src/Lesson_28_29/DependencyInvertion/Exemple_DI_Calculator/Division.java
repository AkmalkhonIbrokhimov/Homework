package Lesson_28_29.DependencyInvertion.Exemple_DI_Calculator;

public class Division implements CalculatorOperation{
    @Override
    public double calculate(double firstNumbaer, double secondNumber) {
        return firstNumbaer/secondNumber;
    }
}
