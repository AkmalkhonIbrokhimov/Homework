package Lambda.MethodReference;

import Lambda.MyMath;

import java.util.function.Function;

public class Second {
    // reference to an instance method of exicting method
    // xotirada mavjud  obyectning methodiga un reference
    //Ссылка на метод экземпляра существующего объекта
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        Function<Integer,Integer>  function = myMath::kvadrat;
        System.out.println(function.apply(5));
    }
}
