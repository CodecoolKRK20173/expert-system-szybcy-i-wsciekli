package com.codecool.expertsystem;

import java.util.Scanner;

public class Display {

    private static String verticalBarLine = "-----------------------------";
    private static String intro = "Welcome to EXPERT CAR SYSTEM\nby Fast And Furious";

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printTitleMenu() {
        System.out.println(intro);
        System.out.println(verticalBarLine);
    }

    public static String getStringInput(String message) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(message);
        return userInput.nextLine();
    }
}
