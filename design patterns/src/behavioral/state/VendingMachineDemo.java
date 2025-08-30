package behavioral.state;

/**
 * Demonstrates the State pattern using the VendingMachine
 */
public class VendingMachineDemo {
    public static void main(String[] args) {
        // Create a vending machine with 3 items
        VendingMachine machine = new VendingMachine(3);

        System.out.println("=== Demonstration of Vending Machine States ===\n");

        // Scenario 1: Normal purchase flow
        System.out.println("Scenario 1: Normal Purchase Flow");
        System.out.println("Current State: " + machine.getCurrentStateName());
        machine.insertMoney(2.00);
        machine.selectProduct("Cola");
        System.out.println("Remaining items: " + machine.getInventory().getCount());
        System.out.println();

        // Scenario 2: Insufficient funds
        System.out.println("Scenario 2: Insufficient Funds");
        System.out.println("Current State: " + machine.getCurrentStateName());
        machine.insertMoney(1.00); // Less than required amount
        machine.selectProduct("Cola");
        machine.returnMoney();
        System.out.println();

        // Scenario 3: Multiple purchases until sold out
        System.out.println("Scenario 3: Multiple Purchases Until Sold Out");
        while (machine.getInventory().hasItems()) {
            System.out.println("Current State: " + machine.getCurrentStateName());
            System.out.println("Items remaining: " + machine.getInventory().getCount());
            machine.insertMoney(2.00);
            machine.selectProduct("Cola");
            System.out.println();
        }

        // Scenario 4: Trying to purchase when sold out
        System.out.println("Scenario 4: Attempting Purchase When Sold Out");
        System.out.println("Current State: " + machine.getCurrentStateName());
        machine.insertMoney(2.00);
        machine.selectProduct("Cola");
    }
}
