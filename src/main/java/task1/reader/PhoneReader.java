package task1.reader;

public interface PhoneReader {
    void readPhone(String source);

    default boolean phoneIsValid(String phoneNumber){
        if (phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
            return true;
        } else return phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
    }
}
