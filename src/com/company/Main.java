package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Boolean quit = false;
        Boolean isLogin = false;
        String userInput;
        String username;
        String password;
        String password1;
        String password2;
        String email = null;
        String accountName = null;
        String[][][][] account;
        String[][] inventory;
        while (quit == false) {
            System.out.println("> ");
            userInput = input.nextLine();
            if (isLogin == false && (userInput != "LOGIN" || userInput != "SIGNUP")){
                System.out.println("LOGIN OR SIGNUP");
            }
            else {
                switch (userInput){
                    case "SIGNUP":
                        System.out.println("ENTER USERNAME");
                        System.out.println("> ");
                        username = input.nextLine();
                        System.out.println("ENTER PASSWORD");
                        System.out.println("> ");
                        password1 = input.nextLine();
                        System.out.println("ENTER PASSWORD AGAIN");
                        System.out.println("> ");
                        password2 = input.nextLine();
                        if (password1 == password2) {
                            password = password1;
                            System.out.println("ENTER EMAIL ADDRESS");
                            System.out.println("> ");
                            email = input.nextLine();
                        }
                        else {
                            System.out.println("PASSWORDS DO NOT MATCH, PLEASE TRY AGAIN");
                            break;
                        };
                    case "LOGIN":
                }
            }
        }
    }
}
