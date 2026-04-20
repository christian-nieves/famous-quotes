package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String quotes[] = new String[10];

            quotes[0] = ("What happens in the dark, always comes to light.");
            quotes[1] = ("Who am I to judge when I myself walk as an imperfect man.");
            quotes[2] = ("What we think, we become.");
            quotes[3] = ("The purpose of life is to be happy.");
            quotes[4] = ("You have one life to live, enjoy it.");
            quotes[5] = ("Dream big and dare to fail.");
            quotes[6] = ("The best way out is always through.");
            quotes[7] = ("Happiness depends on ourselves.");
            quotes[8] = ("The only way to do great work is to love what you do.");
            quotes[9] = ("It does not matter how slowly you go as long as you do not stop.");

            System.out.println("Select a quote(1-10): ");
            int quoteSelect = scanner.nextInt();

            System.out.println(quotes[quoteSelect - 1]);
        } catch (Exception e) {
            System.out.println("Sorry the number you selected does not exist. Please try again.");
        }


    }
}
