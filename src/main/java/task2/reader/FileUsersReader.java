package task2.reader;

import task2.user.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileUsersReader implements UsersReader {
    @Override
    public List<User> readUsers(String source) {
        List<User> usersList = null;
        try (FileReader fr = new FileReader(source);
             BufferedReader bufferedReader = new BufferedReader(fr)) {

            usersList = new ArrayList<>();
            String str = bufferedReader.readLine();
            String[] info = null;

            while ((str = bufferedReader.readLine()) != null) {
                info = str.split(" ");
                usersList.add(new User(info[0], Integer.parseInt(info[1])));
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return usersList != null ? usersList : Collections.emptyList();
    }
}
