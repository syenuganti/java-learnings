package creational.abstractfactory.furniture;

public class VictorianSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an elegant Victorian sofa with tufted upholstery and carved wooden details");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }

    @Override
    public int getNumberOfSeats() {
        return 4; // Victorian sofas typically had more seating
    }
}
