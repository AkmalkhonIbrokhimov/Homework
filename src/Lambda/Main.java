package Lambda;

import Lesson_28_29.DependencyInvertion.ExempleFromTeacher.MAin;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
       MyLambda<Integer> myLambda = i -> {
            for (int j = 1; j < 10; j++) {
                System.out.println(i*j);
            }
        };


    }
}
