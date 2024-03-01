package Lesson_28_29.DependencyInvertion.Exemple_DI_Calculator;

public class Main {
        public static void main(String[] args) {
            Calculator calculator = new Calculator(12.2,12.2,new Addition());
            System.out.println(calculator.calculate());

            Calculator calculator1 = new Calculator(12.2,12.2,new Division());
            System.out.println(calculator1.calculate());
        }
}
