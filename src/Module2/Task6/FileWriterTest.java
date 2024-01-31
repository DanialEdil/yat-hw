package Module2.Task6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {

    public static void main(String[] args) {

        File file = new File("/resource");

        file.mkdir();

        File file1 = new File("/resource/hello.txt");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter("/resource/hello.txt", true)) {
            String text = scanner.nextLine();
            fileWriter.append(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
