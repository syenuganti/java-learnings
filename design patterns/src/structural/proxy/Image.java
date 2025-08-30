package structural.proxy;

// Subject interface
public interface Image {
    void display();
}

// Real Subject - represents the actual image
class RealImage implements Image {
    private String filename;
    private byte[] imageData;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image: " + filename);
        // Simulate loading a large image file
        try {
            Thread.sleep(1000); // Simulate time-consuming image loading
            imageData = new byte[1024]; // Simulate image data
            System.out.println("Image loaded successfully: " + filename);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Proxy - controls access to RealImage
class ImageProxy implements Image {
    private RealImage realImage;
    private String filename;
    private int accessCount;

    public ImageProxy(String filename) {
        this.filename = filename;
        this.accessCount = 0;
    }

    @Override
    public void display() {
        // Lazy initialization - create RealImage only when needed
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        accessCount++;
        System.out.println("Access count for " + filename + ": " + accessCount);
        realImage.display();
    }

    // Additional proxy methods for access control and monitoring
    public int getAccessCount() {
        return accessCount;
    }

    public boolean isImageLoaded() {
        return realImage != null;
    }

    public void resetAccessCount() {
        accessCount = 0;
    }
}
