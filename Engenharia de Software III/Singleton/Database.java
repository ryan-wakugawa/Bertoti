package Singleton;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final List<String> users = new ArrayList<String>();
    private static Database instance;

    private Database() {
        System.out.println("Conector criado");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void addUser(String user) {
        users.add(user);
    }

    public void removeUser(String user) {
        users.remove(user);
    }

    public List<String> getUsers() {
        return users;
    }
}