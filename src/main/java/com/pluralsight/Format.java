package com.pluralsight;

public class Format {
    public static void main(String[] args) {
    formatName("bob" , "Smith");
    }
    public static String formatName(String first, String last){
        System.out.println(last + " " + first);
        return first + last;
    }
}
