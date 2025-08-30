package creational.singleton;

/**
 * Singleton Pattern Example: Database Connection
 *
 * Real-world use case: Managing database connections where we want to ensure
 * only one connection instance exists throughout the application.
 */
public class DatabaseConnection {
    // The single instance of DatabaseConnection
    private static DatabaseConnection instance;

    // Database configuration (simplified for example)
    private String url;
    private String username;
    private boolean isConnected;

    // Private constructor prevents instantiation from other classes
    private DatabaseConnection() {
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "admin";
        this.isConnected = false;
    }

    /**
     * Thread-safe implementation of getInstance using double-checked locking
     */
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void connect() {
        if (!isConnected) {
            System.out.println("Establishing database connection to " + url);
            // Simulate connection setup
            isConnected = true;
            System.out.println("Database connected successfully!");
        } else {
            System.out.println("Already connected to database!");
        }
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnecting from database...");
            isConnected = false;
            System.out.println("Database disconnected successfully!");
        } else {
            System.out.println("Not connected to database!");
        }
    }

    public boolean isConnected() {
        return isConnected;
    }
}
