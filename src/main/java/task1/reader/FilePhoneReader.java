package task1.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePhoneReader implements PhoneReader {

    @Override
    public void readPhone(String source) {
        try (FileReader fis = new FileReader(source);
             BufferedReader bufferedReader = new BufferedReader(fis)) {

            String phoneNumber;

            while ((phoneNumber = bufferedReader.readLine()) != null) {
                if(phoneIsValid(phoneNumber)){
                    System.out.println(phoneNumber);
                }
            }

            } catch(IOException e){
                System.err.println(e.getMessage());
            }
    }
    }
