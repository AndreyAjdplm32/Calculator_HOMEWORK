import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {

        if (x == 0 || y == 0) {
            return 0;
        } else {
            return x / y;
        }
    };
    UnaryOperator<Integer> pow = (x) -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = (x) -> {
        boolean t = x > 0 ? true : false;
        System.out.println(t);
        return t;
    };
    Consumer<Integer> println = System.out::println;  //?


}
