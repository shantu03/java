package Harry;
import java.io.IOException;
import java.io.File;

public class L111_FileHandling {
    public static void main(String[] args) throws IOException {
        File newfile = new File("hello.txt");

        newfile.mkdirs();
        newfile.createNewFile();
    }
}
