package optionals;

import java.util.Optional;
import java.util.function.IntConsumer;

public class Main {

    public static void main(String[] args) {


    IntConsumer println = System.out::println;

        Object value = Optional.ofNullable("Hello Diallo")
                .orElseGet(() -> "default value ");
        System.out.println(value);
    }
}
