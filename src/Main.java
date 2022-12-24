public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(1, 0);
        int d = calc.multiply.apply(1, 5);
        int e = calc.pow.apply(6);
        int f = calc.abs.apply(0);
        calc.println.accept(e);
        calc.isPositive.test(5);


    }
}