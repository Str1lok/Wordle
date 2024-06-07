package logic;

import storage.WordsStorage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Wordle {
    private String[] userWord = new String[5];;
    private String[] pcWord;
    private Random generate = new Random();
    private String word;

    private int attempt = 5;
    public Wordle(WordsStorage storage) {
        this.word = storage.getWords()[generate.nextInt(3)];
        pcWord = word.split(" ");

        for (int i = 0; i != attempt; i++) {
            Scanner in = new Scanner(System.in);
            String user = in.next();
            if (user.length() != 6) {return;}else {
                userWord[i] = user;
                if (Objects.equals(userWord[i], pcWord[0])) {
                    System.out.println("you win!");
                    break;
                }
            }
            if (i == 5) {
                System.out.println("You lose!(");
            }
        }
    }
}
