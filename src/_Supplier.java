import java.util.function.Supplier;

public class _Supplier {
/*
  -------------------------------------------------
           Supplier Functional Interface
  -------------------------------------------------
  Supplier functions represents a supplier of results.
  A supplier function accepts zero arguments
 */
    public static void main(String args[]){
        System.out.println(getDBConnectionString());
        System.out.println(getDBConnectStringSupplier.get());
    }

    //Imperative Approach
    static String getDBConnectionString(){
        return "jdbc://localhost:5432/users";
    }

    //Functonal Approach
    static Supplier<String> getDBConnectStringSupplier = () -> "jdbc://localhost:5432/users";

}
