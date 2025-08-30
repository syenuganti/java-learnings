package creational.abstractfactory.furniture;

/**
 * FurnitureFactory interface represents an Abstract Factory that creates families
 * of related furniture products (chairs, sofas, etc.) in a particular style.
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();

    // We can easily extend this factory to create more furniture types
    // CoffeeTable createCoffeeTable();
    // Bookshelf createBookshelf();
}
