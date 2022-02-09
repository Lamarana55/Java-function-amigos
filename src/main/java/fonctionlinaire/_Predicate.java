package fonctionlinaire;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        String phoneNumber = "224628228638";
        System.out.println("Without predicate");
        biConsumer.accept(phoneNumber, isPhoneNumberValidation(phoneNumber));
        System.out.println("With predicate");
        biConsumer.accept(phoneNumber, isPredicate.test(phoneNumber));


    }



    static Predicate<String> isPredicate = phoneNumber -> phoneNumber.startsWith("224") && phoneNumber.length() == 12;


    public static BiConsumer<String, Boolean> biConsumer = (phone, aBoolean) ->
            System.out.println("phoneNumber: " + phone + (aBoolean? " is valid": " is not valid "));

    static boolean isPhoneNumberValidation(String phoneNumber) {
        return phoneNumber.startsWith("224") && phoneNumber.length() == 12;
    }


}
