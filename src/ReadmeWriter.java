import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadmeWriter {

    public static void writeDietToReadme(Diet diet) {
        if (diet == null) {
            throw new IllegalArgumentException("Diet object cannot be null.");
        }

        try {
            File readme = getReadmeFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(readme, true))) {
                writer.write(diet.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to write diet to README", e);
        }
    }

    private static File getReadmeFile() {
        File rootDir = new File(System.getProperty("user.dir"));
        return new File(rootDir, "README.md");
    }

    public static void clearReadme() {
        try {
            File readme = getReadmeFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(readme, false))) {
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to clear README", e);
        }
    }
}
