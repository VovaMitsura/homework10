package task2.reader;

import task2.user.User;

import java.util.List;

public interface UsersReader {
    List<User> readUsers(String source);
}
