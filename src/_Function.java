import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Function {

    public static void main(String args[]){
        System.out.println(isCopy.test("hello"));
    }

   /*
      ----------------------------------------------
             Function Functional Interface
      ----------------------------------------------
      Functional functions are functions that accept one argument
      and returns a value. Bi functions different in argument count
    */

   static Function<Integer, Integer> incrementByOne = number -> number + 1;
   static Function<Integer, Integer> multipleByTen = number -> number * 10;
   static Function<Integer, Integer> subThree = number -> number - 3;
   static Function<Integer, Integer> math =  incrementByOne.andThen(multipleByTen).andThen(subThree);

   static BiFunction<Integer,Integer,Integer> math2 = (num1, num2) -> (num1 + 1) * num2;

   /*
      --------------------------------------------
            Predicate Functional Interface
      --------------------------------------------
      Predicate functions are boolean valued functions that
      accept one argument and returns a boolean value.
      Bi predicate functions differ from argument count

    */

    static Predicate<Integer> isGreaterThanOne = num -> num > 1;
    static Predicate<String> isCopy = string -> string.equals("hello");


}
