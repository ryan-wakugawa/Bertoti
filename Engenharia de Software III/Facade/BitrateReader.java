package Facade;


public class BitrateReader {
    public static ImageFile read(ImageFile file, Extension extension) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static ImageFile convert(ImageFile buffer, Extension extension) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
