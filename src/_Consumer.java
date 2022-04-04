import java.util.function.BiConsumer;
import java.util.function.Consumer;


/*
  ------------------------------------------
       Consumer Functional Interface
  ------------------------------------------
  Consumer functions accept one argument and doesn't
  return a value
  BiConsumer functions differ in argument count
 */

public class _Consumer {

    public static void main(String args []){
        greetCustomerConsumer.accept(new Customer("Jacob", "630-746-4657"));
        greetCustomerConsumerV2.accept(new Customer("Jacob", "630-746-4657"), false);
    }

    //Imperative approach
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    //Functional Approach
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName
                                                                                      + ", thanks for registering phone number "
                                                                                      + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number "
            + (showPhoneNumber ? customer.customerPhoneNumber : "***-***-****"));

    //Class
    static class Customer{

        private final String customerName;
        private final String customerPhoneNumber;


        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}
