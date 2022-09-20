package task3;

import task3.counter.DuplicateCounter;
import task3.counter.WordsDuplicateCounter;
import task3.reader.FileWordsReader;
import task3.reader.WordsReader;

import java.util.List;
import java.util.Map;

public class Demo {
    private static final String SOURCE_FILE = "D:\\мое\\prog\\Intellias\\homework_10\\src\\main\\resources\\words.txt";

    public static void main(String[] args) {
        WordsReader reader = new FileWordsReader();
        List<String> words = reader.readWords(SOURCE_FILE);

        DuplicateCounter duplicateCounter = new WordsDuplicateCounter(words);
        Map<String, Integer> countOfWords = duplicateCounter.countDuplicates();

        countOfWords.entrySet().
                stream().
                sorted((i1, i2) -> i2.getValue() - i1.getValue())
                .forEach(System.out::println);
    }
}
