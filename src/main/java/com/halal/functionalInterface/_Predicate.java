package com.halal.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String phone1 = "07000000003";
        String phone2 = "0706400000";
        String phone3 = "09065400300";

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid(phone1));
        System.out.println(isPhoneNumberValid(phone2));
        System.out.println(isPhoneNumberValid(phone3));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test(phone1));
        System.out.println(isPhoneNumberValidPredicate.test(phone2));
        System.out.println(isPhoneNumberValidPredicate.test(phone3));

        System.out.println(
                "is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test(phone3));

        System.out.println(
                "is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test(phone1));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> containsNumber3 = phoneNumber
            -> phoneNumber.contains("3");
}
