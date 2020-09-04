package com.company;

import java.util.*;

/**
 * Java Program to reverse array in place
 * In time complexity is O(n)
 * You can not use additional buffer but one or two variables are fine
 * */

public class ReverseArrayInPlace {
    public static void main(String []args) {
        String[] names = {"John", "Jonny", "Luke"};
        System.out.println("Original array: " + Arrays.toString(names));
        // reversing array with three elements
        reverse(names);
        System.out.println("Reversed arrays: " + Arrays.toString(names));
        String[] test = {"John"};
        System.out.println("Original array: " + Arrays.toString(test));
        //testing reverse array function with array of just one element
        reverse(test);
        System.out.println("Reversed arrays: " + Arrays.toString(test));
    }
        /**
         * Java method to reverse String array in place
         */
        public static void reverse(String[] array) {
            if (array == null || array.length < 2) {
                return;
            }
            for (int i = 0; i < array.length / 2; i++) {
                String temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
                    }
