package structural.decorator;

/**
 * The base Component interface defines operations that can be altered by decorators.
 */
public interface Coffee {
    String getDescription();
    double getCost();
}
