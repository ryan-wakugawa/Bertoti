public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        db.addUser("user1");
        db.addUser("user2");
        System.out.println(db.getUsers());
        db.removeUser("user2");
        System.out.println(db.getUsers());
    }
}
