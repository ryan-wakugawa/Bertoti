package Facade;

public class ExtensionFactory {
    public static Extension extract(ImageFile file) {
        String type = file.getExtension();
        if (type.equals("png")) {
            System.out.println("Extension Factory: Extraindo a extensão 'png'");
            return new PNGExtension();
        } else {
            System.out.println("Extension Factory: Extraindo a extensão 'jpeg'");
            return new JPEGExtension();
        }
    }
}
