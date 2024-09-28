package Streams.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Streams.Structure.Person;

public class SortingCustomObject {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Tom", 18),
            new Person("Lucy", 45)
        );

        persons.stream()
        .sorted(Comparator.comparingInt(Person::getAge))
        .forEach(System.out::println);
    }
}
