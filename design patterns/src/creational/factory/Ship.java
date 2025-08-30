package creational.factory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering cargo by sea in a ship...");
    }

    @Override
    public double calculateCost(String destination) {
        // Simplified cost calculation for sea delivery
        return destination.length() * 15.0; // Sea transport is typically more expensive
    }
}
