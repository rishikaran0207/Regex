package com.biz.Regex;
import java.util.Scanner;

    public class User extends Regex {
        public static Scanner scan = new Scanner(System.in);
        public static String first_name, last_name, mail_ID, phone_number, password, check_mail;

        public static void main(String[] args) {
            User details = new User();
            details.firstname();
            details.lastname();

        }


        public static void firstname() {
            System.out.println("\nEnter the first name, \nFirst letter capital minimum 3 letters:");
            first_name = scan.next();
            Regex.name(first_name);
        }
        public static void lastname() {
            System.out.println("\nEnter the last name, \nfirst letter capital and minimum 3 letters:");
            last_name = scan.next();
            Regex.name(last_name);
        }
    }

