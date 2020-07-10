package ru.ovsyannikov.tm;

import java.util.Arrays;

public class Main {
    /*  10.07.2020
        Task-Manager
        version: 1.0.0
        developer: Ovsyannikov Vladislav
     */

    public static void main(final String[] args) {
        run(args);
        displayWelcome();
    }

    private static void run(final String[] args) {
        if (args.length == 0) return;
        if (args.length <1) return;
        final String param=args[0];
        if ("version".equals(param)) displayVersion();
        if ("about".equals(param)) displayAbout();
        if ("help".equals(param)) displayHelp();

    }

    private static void displayWelcome(){
        System.out.println("** Welcome to Task-Manager **");
       /*System.exit(0);*/

    }

    private static void displayAbout(){
        System.out.println("Ovsyannikov Vladislav");
        System.out.println("vldslv.ovsyannikov@gmail.com");
        System.exit(0);

    }

    private static void displayVersion(){
        System.out.println("1.0.0");
        System.exit(0);
    }

    private static void displayHelp(){
        System.out.println("vesrsion - Display application version");
        System.out.println("about - Display developer info");
        System.out.println("help - Display list of commands");
        System.exit(0);
    }
}
