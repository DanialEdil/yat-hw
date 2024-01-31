package Module2.FiveLesson;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[]{"tam",  "brat"};
       Path path = Path.of("che", arr);
        System.out.println(path.getFileSystem());
        System.out.println(path.getFileName());
        System.out.println(path.getParent());

    }
}
