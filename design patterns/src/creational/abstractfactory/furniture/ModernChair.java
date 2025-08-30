package creational.abstractfactory.furniture;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a sleek, minimalist modern chair");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
