package ejercicio3;

import java.util.*;
import java.io.*;

public class Game {
    private final HashMap<String, String> countries;
    private final Scanner scanner;

    public Game(HashMap<String, String> countries, Scanner scanner) {
        this.countries = countries;
        this.scanner = scanner;
    }

    public int play() {
        if (countries.size() < 10) {
            System.out.println("Not enough countries to play 10 rounds");
            return 0;
        }

        ArrayList<String> countryList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countryList);
        int score = 0;

        for (int i = 0; i < 10; i++) {
            String country = countryList.get(i);
            String capital = countries.get(country);
            System.out.println(" What is the Capital of " + country + "?");
            String answer = scanner.nextLine().trim();
            if (answer.equalsIgnoreCase(capital)) {
                System.out.println("Capital " + capital + " Is correct");
                score++;
            } else {
                System.out.println("Wrong ! the Capital is:  " + capital);
            }
        }
        return score;
    }

}
