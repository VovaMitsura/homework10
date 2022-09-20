package task2.writer;

import task2.user.User;

import java.util.List;

public interface UsersWriter {
    void writeUsers(List<User> user, String destination);
}
