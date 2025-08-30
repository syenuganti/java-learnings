package creational.prototype;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    @Override
    public abstract Shape clone();

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }

    public abstract void draw();
}
