package ejercicio3;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            CountryRepository repository = new CountryRepository();
            HashMap<String, String> countries = repository.loadCountries("/countries.txt");

            System.out.print("Enter your name: ");
            String userName = scanner.nextLine().trim();
            if (userName.isEmpty()) {
                System.out.println("Invalid name.");
                return;
            }

            Game game = new Game(countries, scanner);
            int score = game.play();

            ScoreService scoreService = new ScoreService("classificacio.txt");
            scoreService.saveScore(userName, score);

            System.out.println("Final score: " + score);

        } catch (IOException e) {
            System.out.println("Error loading countries: " + e.getMessage());
        }
    }
}