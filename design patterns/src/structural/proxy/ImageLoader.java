package structural.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates different types of proxies working together
 */
public class ImageLoader {
    // Protection Proxy - checks access rights
    static class SecureImageProxy implements Image {
        private Image image;
        private String userRole;

        public SecureImageProxy(Image image, String userRole) {
            this.image = image;
            this.userRole = userRole;
        }

        @Override
        public void display() {
            if (hasAccess()) {
                image.display();
            } else {
                System.out.println("Access denied: Insufficient privileges");
            }
        }

        private boolean hasAccess() {
            return "ADMIN".equals(userRole) || "EDITOR".equals(userRole);
        }
    }

    // Caching Proxy - implements caching mechanism
    static class CachingImageProxy implements Image {
        private static Map<String, Image> imageCache = new HashMap<>();
        private String filename;

        public CachingImageProxy(String filename) {
            this.filename = filename;
        }

        @Override
        public void display() {
            if (!imageCache.containsKey(filename)) {
                System.out.println("Cache miss - loading image: " + filename);
                imageCache.put(filename, new RealImage(filename));
            } else {
                System.out.println("Cache hit - retrieving image: " + filename);
            }
            imageCache.get(filename).display();
        }

        // Cache management methods
        public static void clearCache() {
            imageCache.clear();
            System.out.println("Image cache cleared");
        }

        public static int getCacheSize() {
            return imageCache.size();
        }
    }

    // Logging Proxy - logs all operations
    static class LoggingImageProxy implements Image {
        private Image image;
        private String filename;

        public LoggingImageProxy(Image image, String filename) {
            this.image = image;
            this.filename = filename;
        }

        @Override
        public void display() {
            System.out.println("LOG: Accessing image " + filename + " at " + System.currentTimeMillis());
            image.display();
            System.out.println("LOG: Finished displaying " + filename);
        }
    }
}
