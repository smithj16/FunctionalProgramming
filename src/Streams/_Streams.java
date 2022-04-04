package Streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
  --------------------------------------------------------------------
                             Java Stream
  --------------------------------------------------------------------
   A stream in Java can be defined as a sequence of elements from
   a source. The source of elements here refers to a Collection
   or Array that provides data to the Stream. Java streams are designed
   in such a way that most of the stream operations (called intermediate operations)
   return a stream.
 */

public class _Streams {
    public static void main(String args[]){
      List<Person> people = List.of(
              new Person("Jacob", GENDER.MALE),
              new Person("Cortney", GENDER.FEMALE),
              new Person("Josh", GENDER.MALE),
              new Person("Mel", GENDER.FEMALE)

      );

      Function<Person,String> personStringFunction = person -> person.name;
      ToIntFunction<String> length = String::length;
      IntConsumer println = System.out::println;

      /*
      people.stream()
              .map(personStringFunction)
              .mapToInt(length)
              .forEach(println);

       */

        System.out.println("list contains all females:" + people.stream()
                .allMatch(person -> person.gender.equals(GENDER.FEMALE)));

        System.out.println("List contains a female:" + people.stream()
                .anyMatch(person -> person.gender.equals(GENDER.FEMALE)));


        //given a list of numbers, double the even numbers and total the numbers
        List<Integer> doubleEvenNum = Stream.of(1,2,3,4,5,6,7,8,9)
                .map(num -> (num % 2 == 0) ? num *= 2 : num)
                .collect(Collectors.toList());
        System.out.println(doubleEvenNum.stream().reduce(1, (num1,num2) -> num1 * num2));
        int total = doubleEvenNum.stream()
                .reduce(0,Integer::sum);
        System.out.println(doubleEvenNum);
        System.out.println("Total: " + total);

        /*
        List<Integer> evenList = list.stream()
                                     .filter(num -> num % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println(evenList.stream()
                                   .reduce(5,Integer::sum));

         */

    }

    static class Person {
        private final String name;
        private final GENDER gender;

        Person(String name, GENDER gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person { " +
                    "name=' " + name + '\'' +
                    ", gender=" + gender +
                    "}";

        }

    }

     enum GENDER {
        MALE, FEMALE
    }

}



