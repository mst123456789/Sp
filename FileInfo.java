import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists()) {
            System.out.println("File exists");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File Type: " + (file.isDirectory() ? "Directory" : "File"));
            System.out.println("File Size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist");
        }
    }
}
