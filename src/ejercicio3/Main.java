package ejercicio3;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> countries = new HashMap<>();
        String path = String.valueOf(Paths.get("/Users/macbookpro/IdeaProjects/S1.03.Java_Collections/src/Ejercicio3/countries.txt"));
        FileReader file = new FileReader(path);
        BufferedReader cn = new BufferedReader(new FileReader(path));
        String line;
        while ((line = cn.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length == 2) {
                String country = parts[0].trim();
                String capital = parts[1].trim();
                countries.put(country, capital);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String userName = sc.nextLine();
        int score = 0;
        ArrayList<String> countryList = new ArrayList<>(countries.keySet());
        Random rand = new Random();
        int randIndex = rand.nextInt(countryList.size());
        for (randIndex = 0; randIndex < 10; randIndex++) {
            String country = countryList.get(randIndex);
            String capital = countries.get(country);
            System.out.println("what is the Capital of the following Country: " + country);
            String userAnswer = sc.nextLine().trim();
            if (userAnswer.equalsIgnoreCase(capital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The capital is " + capital );
            }
        }
            System.out.println("the final score is: " + score);

        BufferedWriter bw = new BufferedWriter(new FileWriter("Score.txt", true));
        bw.write(userName + ", here is your score: " + score + " points.");
        bw.newLine();
        bw.close();
        }
    }
