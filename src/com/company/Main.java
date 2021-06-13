/*
 *  UCF COP3330 Summer 2021 Assignment 33 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"Yes", "No", "Ask again later"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);

        String q;

        Scanner jb = new Scanner(System.in);
        System.out.print("What is your question? ");
        q = jb.nextLine();

        System.out.print("> " + arr[randomNumber]);
    }
}
