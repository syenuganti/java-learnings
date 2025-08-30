package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory
public class StyleFactory {
    private static final Map<String, CharacterStyle> styleCache = new HashMap<>();

    public static CharacterStyle getStyle(String fontFamily, int fontSize, String color) {
        String key = fontFamily + "_" + fontSize + "_" + color;

        if (!styleCache.containsKey(key)) {
            styleCache.put(key, new CharacterStyle(fontFamily, fontSize, color));
            System.out.println("Creating new style: " + key);
        } else {
            System.out.println("Reusing existing style: " + key);
        }

        return styleCache.get(key);
    }

    // For demonstration purposes
    public static int getStyleCount() {
        return styleCache.size();
    }

    // TextCharacter class - stores extrinsic state
    public static class TextCharacter {
        private char symbol;
        private int x;
        private int y;
        private CharacterStyle style; // reference to shared flyweight

        public TextCharacter(char symbol, int x, int y, CharacterStyle style) {
            this.symbol = symbol;
            this.x = x;
            this.y = y;
            this.style = style;
        }

        public void render() {
            System.out.println(String.format("Rendering '%c' at (%d,%d) with style %s",
                symbol, x, y, style.toString()));
        }
    }
}
