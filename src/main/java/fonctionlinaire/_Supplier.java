package fonctionlinaire;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("without supplier");
        print.accept(getConnectionURL());
        System.out.println("with supplier");
        print.accept(supplier.get());
    }

    static Consumer<String> print = url -> System.out.println("usr: " + url);

    static String getConnectionURL(){
        return "jdbc://localhost:5234/users";
    }

    static Supplier<String> supplier = () -> "jdbc://localhost:5234/users";
}


