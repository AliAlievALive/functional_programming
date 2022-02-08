package com.halal.combinatorpattern;

import java.time.LocalDate;

import static com.halal.combinatorpattern.CustomerRegistrationValidator.*;
import static com.halal.combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+01212133554",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        //if valid we can store customer in DB

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
