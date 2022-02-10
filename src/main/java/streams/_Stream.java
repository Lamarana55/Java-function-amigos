package streams;


import imperative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;
import static streams._Stream.Gender.NOT_GENDER;


public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Adama", FEMALE),
                new Person("Mamadou Lamarana", MALE),
                new Person("Ismatou", FEMALE),
                new Person("Ismatou", NOT_GENDER),
                new Person("Kadiatou", FEMALE)
        );

        /*people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
*/
        Function<Person, String> personStringFunction = person -> person.name;

        IntConsumer println = System.out::println;

        /*people.stream()
                .map(personStringFunction)
                .mapToInt(String::length)
                .sorted()
                .distinct()
                .forEach(println);*/

        boolean containsOnlyFemales = people.stream()
                .noneMatch (person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);


    }

    static class Person{
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE, NOT_GENDER
    }
}
