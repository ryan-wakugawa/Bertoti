package Facade;

public class ImageFile {
    private final String fileName;
    private final String extension;

    public ImageFile(String fileName) {
        this.fileName = fileName;
        this.extension = fileName.substring(
                fileName.indexOf(".") + 1
        );
    }

    public String getFileName() {
        return fileName;
    }

    public String getExtension() {
        return extension;
    }
}
