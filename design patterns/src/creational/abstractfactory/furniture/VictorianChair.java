package creational.abstractfactory.furniture;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an ornate Victorian chair with detailed carvings");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
