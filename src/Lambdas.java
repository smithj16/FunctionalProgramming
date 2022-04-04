import java.util.function.BiFunction;
import java.util.function.Function;

/*
  ------------------------------------------------------------------------------------
                             Lambdas vs Method Invocation
  ------------------------------------------------------------------------------------
   -  A lambda expression is a short block of code which takes in parameters
      and returns a value. Lambda expressions are similar to methods, but they
      do not need a name and they can be implemented right in the body of a method.

   - The method invocation statement calls a method defined for the class of a reference
     variable. This statement is used for methods of user classes, system classes, and
     external classes. You can invoke any method defined for the class of the reference
     variable or any inherited method from the variable's superclasses.
 */
public class Lambdas {
    public static void main(String[] args) {
        //Lambda
        Function<String, String> nameToUpper = name -> name.toUpperCase();

        //Lambda with multiple arguments
        BiFunction<String, Integer, String> nameToUpper2 = (name, age) -> {
           if(name.isBlank())
               throw new IllegalArgumentException();
            System.out.println(age);
            return name.toUpperCase();
        };

        //Method Invocation
        Function<String, String> nameToUpper3 = String::toUpperCase;


    }
}
