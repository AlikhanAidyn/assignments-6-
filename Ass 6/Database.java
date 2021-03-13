package subtask1;

class Database {

    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            acquireThreadLock();
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void query(String sql) {
    }
}

class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT ...");

        Database bar = Database.getInstance();
        bar.query("SELECT ...");
    }
}