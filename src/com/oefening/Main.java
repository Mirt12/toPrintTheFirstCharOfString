package com.oefening;

public class Main {

    public static void main(String[] args) {
        //to print first char of the str:
        String str = ".agfrtyiopmsw";
        char ch = str.charAt(0);
        System.out.println(ch);
        //to print any char of the str:
        int j = (int) Math.floor(Math.random() * str.length());
        ch = str.charAt(j);
        System.out.println(ch);
        //to print char in UpperCase:
        ch = 'q';
        char chU = Character.toUpperCase(ch);
        System.out.println(chU);
    }
}
