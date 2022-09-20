package task1.reader;

import java.util.List;

public interface PhoneReader {
    List<String> readPhone(String source);

    default boolean phoneIsValid(String phoneNumber){
        if (phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
            return true;
        } else return phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
    }
}
