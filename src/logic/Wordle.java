package logic;

import storage.WordsStorage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.awt.Color.GRAY;

public class Wordle {
    private String[] userWord = new String[5];
    private String[] pcWord;
    private Random generate = new Random();
    private String word;
    private final String ANSI_GREEN = "\u001B[32m";
    private final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_RED = "\u001B[31m";

    private int attempt = 5;
    public Wordle(WordsStorage storage) {
        this.word = storage.getWords()[generate.nextInt(3)];
        pcWord = word.split("");

        for (int i = 0; i != attempt; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println(i + 1 + " попытка");
            String user = in.next();

            if (user.length() != 6) {
                return;
            } else {
                userWord = user.split("");
                if (Arrays.equals(userWord, pcWord)) {
                    System.out.println("Ты отгадал слово, поздравляю!" + ANSI_GREEN);
                    break;
                } else {
                   for (int j = 0; j < pcWord.length; j++){
                       if (pcWord[j].equals(userWord[j])){
                           System.out.println(pcWord[j] + ANSI_GREEN);
                       }
                   }
                }
            }
            if (i == attempt) {
                System.out.println("Ты не отгадал слово, загаданное слово было: " + ANSI_RED + word);
            }
        }
    }
}
