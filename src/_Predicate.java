import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
      --------------------------------------------
            Predicate Functional Interface
      --------------------------------------------
      Predicate functions are boolean valued functions that
      accept one argument and returns a boolean value.
      Bi predicate functions differ from argument count

 */

public class _Predicate {

    public static void main(String args[]){
        System.out.println(isPhoneNumberValidPredicate.test("00000000000"));

        /*
           Chaining predicate functions. Note:
           and/or function replaces the corresponding operators
         */

        //And
        System.out.println(isPhoneNumberValidPredicate.and(contains3).test("07300000000"));

        //Or
        System.out.println(isPhoneNumberValidPredicate.or(contains3).test("00000000000000"));

        //BiPredicate
        System.out.println(isJacob.test("Jacob", "6307767111"));
    }

    //Imperative Approach
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    //Functional Approach
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static Predicate<String> contains3 = phoneNumber -> phoneNumber.contains("3");
    static BiPredicate<String, String> isJacob = (name, phoneNumber) -> name.equals("Jacob") && phoneNumber.equals("6307767722");

}
