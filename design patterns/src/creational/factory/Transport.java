package creational.factory;

/**
 * Transport is the abstract product interface that declares the operations
 * all concrete transport types must implement.
 */
public interface Transport {
    void deliver();
    double calculateCost(String destination);
}
