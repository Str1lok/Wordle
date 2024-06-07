package logic;

import storage.WordsStorage;
import java.util.Random;

public class Wordle {
    private Random generate = new Random();
    private String word;
    private int attempt = 5;
    public Wordle(WordsStorage storage) {
        this.word = storage.getWords()[generate.nextInt(3)];

    }
}
