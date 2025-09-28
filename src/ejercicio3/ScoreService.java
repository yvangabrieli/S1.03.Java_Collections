package ejercicio3;

import java.io.*;
import java.util.*;
public class ScoreService {
    private final String scoreFilePath;

    public ScoreService(String scoreFilePath) {
        this.scoreFilePath = scoreFilePath;
    }
    public void saveScore(String userName, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(scoreFilePath, true))) {
            writer.write(userName + ", your score: " + score + " points.");
            writer.newLine();
        } catch (IOException e ){
            System.out.println("Error saving score: " + e.getMessage() );
        }
    }
}
