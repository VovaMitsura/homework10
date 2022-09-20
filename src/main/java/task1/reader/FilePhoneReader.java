package task1.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilePhoneReader implements PhoneReader {

    @Override
    public List<String> readPhone(String source) {
        List<String> phonesList = null;
        try (FileReader fis = new FileReader(source);
             BufferedReader bufferedReader = new BufferedReader(fis)) {
            phonesList = new ArrayList<>();
            String phoneNumber;

            while ((phoneNumber = bufferedReader.readLine()) != null) {
                if (phoneIsValid(phoneNumber)) {
                    phonesList.add(phoneNumber);
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return phonesList != null ? phonesList : Collections.emptyList();
    }
}
