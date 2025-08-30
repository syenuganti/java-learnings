package creational.abstractfactory.furniture;

public class ModernSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a clean-lined modern sofa with minimal ornamentation");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }

    @Override
    public int getNumberOfSeats() {
        return 3;
    }
}
