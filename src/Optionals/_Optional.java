package Optionals;

import java.util.Optional;

/*
  --------------------------------------------------------
                         Optionals
  --------------------------------------------------------
    Optional is a container object used to contain
    not-null objects. Optional object is used to
    represent null with absent value. This class
    has various utility methods to facilitate code
    to handle values as 'available' or 'not available'
    instead of checking null values.
 */

public class _Optional {
    public static void main(String args[]){

        System.out.println(Optional.ofNullable(null)
                .orElseGet(() -> "default value"));

        // Takes Consumer and Supplier
        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("sending mail to " + email),
                () -> System.out.println("cannot send email"));
    }
}
