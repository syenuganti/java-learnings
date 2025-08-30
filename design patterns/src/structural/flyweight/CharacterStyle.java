package structural.flyweight;

// Intrinsic state - shared properties
public class CharacterStyle {
    private String fontFamily;
    private int fontSize;
    private String color;

    public CharacterStyle(String fontFamily, int fontSize, String color) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CharacterStyle{" +
                "font='" + fontFamily + '\'' +
                ", size=" + fontSize +
                ", color='" + color + '\'' +
                '}';
    }
}
