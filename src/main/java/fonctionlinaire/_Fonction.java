package fonctionlinaire;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Fonction {

    public static void main(String[] args) {
        int increment = increment(2);
        System.out.println("Number " + increment);

        Integer increment2 = incrementByOneFuction.apply(2);
        System.out.println("Number " + increment2);

        Function<Integer, Integer> addByAndThen= incrementByOneFuction.andThen(mutiplyBy10Function);


        System.out.println("Then " + addByAndThen.apply(5));

        System.out.println("BiFuction " + incrementAndMultiplyBiFunction.apply(5, 999));

    }

    static Function<Integer, Integer> incrementByOneFuction = number -> ++number;
    static Function<Integer, Integer> mutiplyBy10Function = number -> number * 10;
    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction =
            (number , number2) -> (number + 1) * number2;


    static int increment(int number){
        return  number + 1;
    }


}
