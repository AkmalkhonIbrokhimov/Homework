package Lambda.MethodReference;

import Lambda.MyMath;

import java.util.function.Function;

public class Fourth {
    // reference to constructor
    // ссылка на конструктор
    public static void main(String[] args) {
        Function<Integer, MyMath> function = MyMath::new;
        MyMath myMath = function.apply(12);
        System.out.println(myMath.kvadrat(2));
    }
}
