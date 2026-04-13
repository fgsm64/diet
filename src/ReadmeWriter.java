import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadmeWriter {

    private File readmeFile;

    public ReadmeWriter() {
        setReadmeFile();
        clearReadme();
    }

    public void writeDietToReadme(Diet diet) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(readmeFile, true));
            writer.write(diet.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to write diet to README", e);
        }
    }

    private void setReadmeFile() {
        try {
            File rootDir = new File(System.getProperty("user.dir"));
            readmeFile = new File(rootDir, "README.md");
            if (!readmeFile.exists()) {
                readmeFile.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to create README file", e);
        }
    }

    private void clearReadme() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(readmeFile, false));
            writer.write("");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to clear README", e);
        }
    }
}
