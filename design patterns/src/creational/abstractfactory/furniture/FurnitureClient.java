package creational.abstractfactory.furniture;

/**
 * Client class demonstrates how to use the Abstract Factory pattern
 * to create consistent families of furniture products.
 */
public class FurnitureClient {
    private FurnitureFactory factory;

    public FurnitureClient(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void orderFurnitureSet() {
        // Create furniture pieces using the factory
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        // Use the furniture
        System.out.println("Ordered a furniture set in " + chair.getStyle() + " style:");
        chair.sitOn();
        sofa.sitOn();
        System.out.println("The sofa has " + sofa.getNumberOfSeats() + " seats");
    }

    public static void main(String[] args) {
        // Create a Modern furniture set
        System.out.println("Creating Modern Furniture Set:");
        FurnitureClient modernClient = new FurnitureClient(new ModernFurnitureFactory());
        modernClient.orderFurnitureSet();

        System.out.println("\nCreating Victorian Furniture Set:");
        // You can easily switch to a different style by using a different factory
        FurnitureClient victorianClient = new FurnitureClient(new VictorianFurnitureFactory());
        victorianClient.orderFurnitureSet();
    }
}
