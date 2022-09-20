package task2.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import task2.user.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonUsersWriter implements UsersWriter{
    @Override
    public void writeUsers(List<User> user, String destination) {
        Gson parser = null;

        try (FileWriter writer = new FileWriter(destination)) {

            parser = new GsonBuilder().setPrettyPrinting().create();

            parser.toJson(user, writer);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
