package Lambda.MethodReference;

import java.util.function.Function;

public class Threed {
    // refernce to an instance method of an object of a particular type
    //muayyan turdagi ob'ektning un reference
    //ссылка на метод экземпляра объекта определенного типа
    public static void main(String[] args) {
        Function<Long,Double> function = Long::doubleValue;
        System.out.println(function.apply(213453533l));
    }
}
