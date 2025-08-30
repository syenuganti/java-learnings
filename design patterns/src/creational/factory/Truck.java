package creational.factory;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering cargo by land in a truck...");
    }

    @Override
    public double calculateCost(String destination) {
        // Simplified cost calculation for truck delivery
        return destination.length() * 10.0; // Cost based on destination length
    }
}
