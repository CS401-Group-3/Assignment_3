package org.example;

public class Main {
    public static void main(String[] args) {
        // Demonstration of concat method
        String concatenated = StringUtils.concat("Hello, ", "World!");
        System.out.println("Concatenated string: " + concatenated);

        // Demonstration of reverse method
        String reversed = StringUtils.reverse("abcd");
        System.out.println("Reversed string: " + reversed);

        // Demonstration of toUpperCase method
        String upperCased = StringUtils.toUpperCase("hello world");
        System.out.println("Uppercased string: " + upperCased);

        // Demonstration of trim method
        String trimmed = StringUtils.trim("   trim me   ");
        System.out.println("Trimmed string: " + trimmed + ".");
    }
}