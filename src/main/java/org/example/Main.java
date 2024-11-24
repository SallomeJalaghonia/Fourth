package org.example;

import java.util.Scanner;
// მეოთხე დავალება
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("გთხოვთ, ჩაწერეთ რიცხვი:");
        int number = scanner.nextInt(); // გადაცემული რიცხვის წაკითხვა ?!

        checkNumber(number); // checkNumber მეთოდის გამოძახება

        scanner.close();
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("რიცხვი დადებითია");
        } else if (number < 0) {
            System.out.println("რიცხვი უარყოფითია");
        } else {
            System.out.println("რიცხვი არის ნული");
        }
    }
}
