import logic.Wordle;
import storage.WordsStorage;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordsStorage ws = new WordsStorage("Database.txt");

        Wordle w = new Wordle(ws);

    }
}