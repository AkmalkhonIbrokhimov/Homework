package Lesson_28_29.DependencyInvertion.Exemple_DI_Calculator;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    CalculatorOperation calculatorOperation;

    public Calculator(double firstNumber, double secondNumber, CalculatorOperation calculatorOperation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.calculatorOperation = calculatorOperation;
    }
    public double calculate(){
        return this.calculatorOperation.calculate(this.firstNumber,this.secondNumber);
    }
}
