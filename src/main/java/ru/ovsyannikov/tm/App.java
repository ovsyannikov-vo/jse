package ru.ovsyannikov.tm;

import static ru.ovsyannikov.tm.constant.TerminalConst.*;

public class App {
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
        switch (param){
            case VERSION: displayVersion();
            case ABOUT:  displayAbout();
            case HELP: displayHelp();
            default: displayError();
        }
    }
    private static void displayError(){
        System.out.println("Error! Unknown program argument...");
        System.exit(-1);
    }
    private static void displayWelcome(){
        System.out.println("** Welcome to Task-Manager **");
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
