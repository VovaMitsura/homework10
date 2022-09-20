package task3.counter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsDuplicateCounter implements DuplicateCounter{
    private final List<String> listOfWords;
    private final Map<String, Integer> occurrencesOfWords;
    private int currentHashCodeOfList;

    public WordsDuplicateCounter(List<String> listOfWords) {
        this.listOfWords = listOfWords;
        this.currentHashCodeOfList = listOfWords.hashCode();
        this.occurrencesOfWords = new HashMap<>();
    }

    @Override
    public Map<String, Integer> countDuplicates() {
        int wordsHashCode = listOfWords.hashCode();

        if (occurrencesOfWords.isEmpty() || wordsHashCode != currentHashCodeOfList) {
            occurrencesOfWords.clear();
            for (String word : listOfWords) {
                occurrencesOfWords.merge(word, 1, Integer::sum);
            }
            currentHashCodeOfList = wordsHashCode;
        }

        return occurrencesOfWords;
    }
}
