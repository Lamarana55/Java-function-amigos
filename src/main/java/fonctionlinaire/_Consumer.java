package fonctionlinaire;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer adamaDiallo = new Customer("Adama diallo", "999999");
        greetCustomer(adamaDiallo);
        greetCustomerConsumer.accept(adamaDiallo);
        System.out.println("BiConsumer");
        greetCustomerBiConsumer.accept(adamaDiallo, true);

    }


    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("customer = " + customer);
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.name + "\nThinks for registering phone number " +
                    (showPhoneNumber? customer.phoneNumber : "************"));

    static void greetCustomer(Customer customer){
        System.out.println("customer = [" + customer + "]");
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }
}
