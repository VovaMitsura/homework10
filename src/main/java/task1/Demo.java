package task1;

import task1.reader.FilePhoneReader;
import task1.reader.PhoneReader;

public class Demo {
    private static final String PATH_TO_FILE = "D:\\мое\\prog\\Intellias\\homework_10\\src\\main\\resources\\phones.txt";

    public static void main(String[] args) {
        PhoneReader phoneReader = new FilePhoneReader();
        phoneReader.readPhone(PATH_TO_FILE);
    }
}
