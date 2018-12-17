package com.manny;

public class Main {

    public static void main(String[] args) {
	//
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        //Challenge:
        // 1. Find the code for the registered trademark on the same line as the copyright symbol
        // 2. Create a variable of type char to assign it the unicode value of that symbol
        // 3. Display it on the screen

        char myNewChar = '\u00Ae';
        System.out.println("New unicode output was " + myNewChar);
    }
}
