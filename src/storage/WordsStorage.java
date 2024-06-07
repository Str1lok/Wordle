package storage;

import java.io.*;

public class WordsStorage {
    private String[] words;
    public WordsStorage(String path) throws FileNotFoundException {
        File file = new File(path);
        InputStreamReader isReader = new InputStreamReader(new FileInputStream(file));
        BufferedReader reader = new BufferedReader(isReader);
        words = reader.lines().toArray(String[]::new);
    }
    public String[] getWords() {
        return words;
    }
}
