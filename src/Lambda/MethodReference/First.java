package Lambda.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class First {
    //refernce to  Static methods
    public static void main(String[] args) {
        BiFunction<Integer, Integer,Integer> fanction = Math::min;
        System.out.println(fanction.apply(5,7));

    }
}
