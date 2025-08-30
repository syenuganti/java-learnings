package behavioral.state;

/**
 * VendingMachine class that uses the State pattern to manage its behavior
 * Acts as the context class that delegates behavior to the current state
 */
public class VendingMachine {
    // Current state of the machine
    private VendingMachineState currentState;
    private double currentAmount;
    private Inventory inventory;

    // All possible states
    private final VendingMachineState noMoneyState;
    private final VendingMachineState hasMoneyState;
    private final VendingMachineState soldOutState;
    private final VendingMachineState dispensingState;

    // Constructor initializes all states and sets initial state
    public VendingMachine(int itemCount) {
        // Create state instances
        noMoneyState = new NoMoneyState();
        hasMoneyState = new HasMoneyState();
        soldOutState = new SoldOutState();
        dispensingState = new DispensingState();

        inventory = new Inventory(itemCount);
        currentAmount = 0.0;

        // Set initial state based on inventory
        if (inventory.hasItems()) {
            currentState = noMoneyState;
        } else {
            currentState = soldOutState;
        }
    }

    // Methods that delegate to current state
    public void insertMoney(double amount) {
        currentState.insertMoney(this, amount);
    }

    public void selectProduct(String product) {
        currentState.selectProduct(this, product);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void returnMoney() {
        currentState.returnMoney(this);
    }

    // State management methods
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void addMoney(double amount) {
        this.currentAmount += amount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void resetAmount() {
        this.currentAmount = 0.0;
    }

    // Getters for states and inventory
    public VendingMachineState getNoMoneyState() { return noMoneyState; }
    public VendingMachineState getHasMoneyState() { return hasMoneyState; }
    public VendingMachineState getSoldOutState() { return soldOutState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public Inventory getInventory() { return inventory; }

    // Current state information
    public String getCurrentStateName() {
        if (currentState instanceof NoMoneyState) return "NO_MONEY";
        if (currentState instanceof HasMoneyState) return "HAS_MONEY";
        if (currentState instanceof DispensingState) return "DISPENSING";
        if (currentState instanceof SoldOutState) return "SOLD_OUT";
        return "UNKNOWN";
    }
}

/**
 * Helper class to manage product inventory
 */
class Inventory {
    private int itemCount;
    private static final double ITEM_PRICE = 1.50; // Fixed price for simplicity

    public Inventory(int itemCount) {
        this.itemCount = itemCount;
    }

    public boolean hasItems() {
        return itemCount > 0;
    }

    public void dispenseItem() {
        if (itemCount > 0) {
            itemCount--;
            System.out.println("Item dispensed. Remaining items: " + itemCount);
        }
    }

    public int getCount() {
        return itemCount;
    }

    public static double getItemPrice() {
        return ITEM_PRICE;
    }
}
