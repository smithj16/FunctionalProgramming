import java.util.function.Consumer;
/*
   ------------------------------------------------
                        CallBack
   ------------------------------------------------
       Any function that is passed as an argument
       to another function so that it can be
       executed in that other function is called
       as a callback function.
 */

public class Callback {
    public static void main(String[] args) {

      //Callback isn't invoked
        hello("Jacob", "Smith", value -> System.out.println("no lastName provided for " + value));

      //Callback is invoked
        hello("Jacob", null, value -> System.out.println("no lastName provided for " + value));
    }

    static void hello(String firstName, String lastName,Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null)
            System.out.println(lastName);
        else
            callback.accept(firstName);
    }
}
