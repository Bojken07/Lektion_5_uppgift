package com.bojken.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Ask about the first players name.
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("Player1: " + name);
    }
}
