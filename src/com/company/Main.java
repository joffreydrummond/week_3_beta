package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Here is an array of int");
        int[] array = {113, 35, 22, 87, 13, 46, -45};
        double[] array1 = {113.43, 35.6, 22.4, 87.11, 13.87, 46};

        System.out.println(array);
        System.out.println("Print the 1st element");
        System.out.println(array[ 0 ]);
        int lastArrayIndex = array[ array.length - 1 ];
        System.out.println("Print the last element");
        System.out.println(lastArrayIndex);
        System.out.println("Use a for loop to print array elements");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[ i ]);
        }
        System.out.println("Use enhanced for loop to print array elements");
        for (int arr : array) {
            System.out.println(arr);
        }
        String[] namesArray = {"Sam", "Sally", "Thomas", "Robert"};
        int sum = 0;
        for (String name : namesArray) {
            System.out.println("Here is the sum of all elements added together " + (sum += name.length()));
        }

        nameGreeting("Fred");
        System.out.println(greeting("Joffrey"));

        System.out.println(stringGreaterTh("these are words", 55));

        System.out.println("If the string passed exists in the array return true " + stringArray(namesArray, "Sall"));

        System.out.println(intArray(array) + " is the smallest element.");

        System.out.println(averageDouble(array1));
        System.out.println("Here are words " + sumOfEvenLettersMore(namesArray));

        int[] test = stringArray(namesArray);
        for (int tru : test) {
            System.out.println(tru);
        }


        System.out.println(sumOfEvenLettersMore(namesArray));

        System.out.println(palindrome("moms"));
    }

    public static void nameGreeting(String name) {
        System.out.println("Hello " + name);
    }

    public static String greeting(String name) {
        return "Hello " + name;
    }

    public static boolean stringGreaterTh(String letters, int chars) {
        return letters.length() > chars;
    }

    ;

    public static boolean stringArray(String[] array, String s) {
        for (String str : array) {
            if (str.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static int intArray(int[] arr) {
        int smallest = arr[ 0 ];
        for (int nums : arr) {
            if (nums < smallest) {
                smallest = nums;
                System.out.println(smallest);
            }
        }
        return smallest;
    }

    public static double averageDouble(double[] array) {
        double arrayLength = array.length;
        double sum = 0;
        for (double arr : array) {
            sum += arr;
        }
        return sum / arrayLength;
    }

    public static int[] stringArray(String[] strArr) {
        int[] res = new int[ strArr.length ];

        for (int i = 0; i < strArr.length; i++) {
            res[ i ] = strArr[ i ].length();
        }
        System.out.println(res);
        return res;
    }

    public static boolean sumOfEvenLettersMore(String[] strArr) {
        int even = 0;
        int odd = 0;
        for (String str : strArr) {
            int nums = str.length();
            if (nums % 2 == 0) {
                even += nums;
                System.out.println("Even: " + even);

            } else {
                odd += nums;
                System.out.println("Odd: " + odd);
            }
        }
        return even > odd;
    }

    public static boolean palindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                i++;
                j--;
                return false;
            }
        }
        return true;

    }

}