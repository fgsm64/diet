import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadmeWriter {

    public static void writeDietToReadme(Diet diet) throws IOException {
        if (diet == null) {
            throw new IllegalArgumentException("Diet object cannot be null.");
        }

        // Locate project root: parent directory of "src"
        File readme = getReadmeFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(readme, true))) {
            writer.write(diet.toString());
            writer.newLine();
        }

        System.out.println("README.md created successfully at: " + readme.getAbsolutePath());
    }

    private static File getReadmeFile() throws IOException {
        File rootDir = new File(System.getProperty("user.dir"));

        return new File(rootDir, "README.md");
    }

    public static void clearReadme() throws IOException {
        File readme = getReadmeFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(readme, false))) {
            // writing nothing clears the file
        }

        System.out.println("README.md cleared at: " + readme.getAbsolutePath());
    }

}
