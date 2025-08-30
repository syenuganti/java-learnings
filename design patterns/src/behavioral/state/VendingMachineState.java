package behavioral.state;

/**
 * State interface defining all possible actions in the vending machine
 */
public interface VendingMachineState {
    void insertMoney(VendingMachine machine, double amount);
    void selectProduct(VendingMachine machine, String product);
    void dispense(VendingMachine machine);
    void returnMoney(VendingMachine machine);
}

/**
 * State when the machine is waiting for money
 */
class NoMoneyState implements VendingMachineState {
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        if (machine.getInventory().hasItems()) {
            System.out.println("Money inserted: $" + amount);
            machine.addMoney(amount);
            machine.setState(machine.getHasMoneyState());
        } else {
            System.out.println("Machine is sold out. Money returned: $" + amount);
        }
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Please insert money first");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Please insert money first");
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("No money to return");
    }
}

/**
 * State when money has been inserted
 */
class HasMoneyState implements VendingMachineState {
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Adding more money: $" + amount);
        machine.addMoney(amount);
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        double price = 1.50; // Fixed price for simplicity
        if (machine.getCurrentAmount() >= price) {
            System.out.println("Product selected: " + product);
            machine.setState(machine.getDispensingState());
            machine.dispense();
        } else {
            System.out.println("Insufficient funds. Please insert more money");
            System.out.println("Current amount: $" + machine.getCurrentAmount());
            System.out.println("Required amount: $" + price);
        }
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Please select a product first");
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("Returning money: $" + machine.getCurrentAmount());
        machine.resetAmount();
        machine.setState(machine.getNoMoneyState());
    }
}

/**
 * State when the machine is dispensing product
 */
class DispensingState implements VendingMachineState {
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Please wait, dispensing in progress");
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Please wait, dispensing in progress");
    }

    @Override
    public void dispense(VendingMachine machine) {
        machine.getInventory().dispenseItem();
        System.out.println("Product dispensed");
        machine.resetAmount();

        if (machine.getInventory().hasItems()) {
            machine.setState(machine.getNoMoneyState());
        } else {
            System.out.println("Machine is now sold out");
            machine.setState(machine.getSoldOutState());
        }
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("Cannot return money while dispensing");
    }
}

/**
 * State when the machine is sold out
 */
class SoldOutState implements VendingMachineState {
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Machine is sold out. Cannot accept money");
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Machine is sold out");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Machine is sold out");
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        if (machine.getCurrentAmount() > 0) {
            System.out.println("Returning money: $" + machine.getCurrentAmount());
            machine.resetAmount();
        }
    }
}
