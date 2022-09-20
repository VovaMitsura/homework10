package task3.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileWordsReader implements WordsReader {
    @Override
    public List<String> readWords(String source) {
        List<String> wordsList = null;
        String line = null;

        try (FileReader reader = new FileReader(source);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            wordsList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll(" +", " ");
                Collections.addAll(wordsList, line.split(" "));
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return wordsList != null ? wordsList : Collections.emptyList();
    }
}
