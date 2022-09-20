package task2;

import task2.reader.FileUsersReader;
import task2.reader.UsersReader;
import task2.user.User;
import task2.writer.JsonUsersWriter;
import task2.writer.UsersWriter;

import java.util.List;

public class Demo {
    private static final String SOURCE_FILE = "D:\\мое\\prog\\Intellias\\homework_10\\src\\main\\resources\\users.txt";
    private static final String DISTINCTION_FILE = "D:\\мое\\prog\\Intellias\\homework_10\\src\\main\\resources\\users.json";

    public static void main(String[] args) {
        UsersReader reader = new FileUsersReader();
        List<User> userList = reader.readUsers(SOURCE_FILE);

        UsersWriter writer = new JsonUsersWriter();
        writer.writeUsers(userList, DISTINCTION_FILE);
    }
}