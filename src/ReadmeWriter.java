import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadmeWriter {

    public static void writeDietToReadme(Diet diet) throws IOException {
        if (diet == null) {
            throw new IllegalArgumentException("Diet object cannot be null.");
        }

        File readme = getReadmeFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(readme, true))) {
            writer.write(diet.toString());
            writer.newLine();
        }
    }

    private static File getReadmeFile() throws IOException {
        File rootDir = new File(System.getProperty("user.dir"));
        
        return new File(rootDir, "README.md");
    }

    public static void clearReadme() throws IOException {
        File readme = getReadmeFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(readme, false))) {
        }
    }
}
