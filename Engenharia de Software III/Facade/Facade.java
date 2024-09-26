package Facade;

public class Facade {
    public void convertImage(String fileName, String format) {
        System.out.println("Facade: conversão iniciada...");
        ImageFile file = new ImageFile(fileName);
        Extension sourceExtension = ExtensionFactory.extract(file);
        Extension destinationExtension;
        if (format.equals("png")) {
            destinationExtension = new PNGExtension();
        } else {
            destinationExtension = new JPEGExtension();
        }
        ImageFile buffer = BitrateReader.read(file, sourceExtension);
        ImageFile intermediateResult = BitrateReader.convert(buffer, destinationExtension);
        System.out.println("Facade: conversão completa.");
    }
}
