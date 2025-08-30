package creational.builder;

/**
 * The product class that represents a custom-built computer
 */
public class Computer {
    // Required parameters
    private String cpu;
    private String motherboard;
    private int ram;

    // Optional parameters
    private String graphicsCard;
    private String soundCard;
    private boolean hasWiFi;
    private boolean hasBluetooth;
    private int ssdStorage;
    private int hddStorage;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.motherboard = builder.motherboard;
        this.ram = builder.ram;
        this.graphicsCard = builder.graphicsCard;
        this.soundCard = builder.soundCard;
        this.hasWiFi = builder.hasWiFi;
        this.hasBluetooth = builder.hasBluetooth;
        this.ssdStorage = builder.ssdStorage;
        this.hddStorage = builder.hddStorage;
    }

    @Override
    public String toString() {
        StringBuilder specs = new StringBuilder();
        specs.append("Computer Specifications:\n");
        specs.append("CPU: ").append(cpu).append("\n");
        specs.append("Motherboard: ").append(motherboard).append("\n");
        specs.append("RAM: ").append(ram).append("GB\n");

        if (graphicsCard != null) {
            specs.append("Graphics Card: ").append(graphicsCard).append("\n");
        }
        if (soundCard != null) {
            specs.append("Sound Card: ").append(soundCard).append("\n");
        }
        if (hasWiFi) {
            specs.append("WiFi: Included\n");
        }
        if (hasBluetooth) {
            specs.append("Bluetooth: Included\n");
        }
        if (ssdStorage > 0) {
            specs.append("SSD Storage: ").append(ssdStorage).append("GB\n");
        }
        if (hddStorage > 0) {
            specs.append("HDD Storage: ").append(hddStorage).append("GB\n");
        }

        return specs.toString();
    }

    /**
     * Builder class for constructing Computer objects
     */
    public static class ComputerBuilder {
        // Required parameters
        private final String cpu;
        private final String motherboard;
        private final int ram;

        // Optional parameters - initialized with default values
        private String graphicsCard = null;
        private String soundCard = null;
        private boolean hasWiFi = false;
        private boolean hasBluetooth = false;
        private int ssdStorage = 0;
        private int hddStorage = 0;

        public ComputerBuilder(String cpu, String motherboard, int ram) {
            this.cpu = cpu;
            this.motherboard = motherboard;
            this.ram = ram;
        }

        public ComputerBuilder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder withSoundCard(String soundCard) {
            this.soundCard = soundCard;
            return this;
        }

        public ComputerBuilder withWiFi() {
            this.hasWiFi = true;
            return this;
        }

        public ComputerBuilder withBluetooth() {
            this.hasBluetooth = true;
            return this;
        }

        public ComputerBuilder withSSDStorage(int gigabytes) {
            this.ssdStorage = gigabytes;
            return this;
        }

        public ComputerBuilder withHDDStorage(int gigabytes) {
            this.hddStorage = gigabytes;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
