import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {

    public static void main(String[] args) throws IOException {

        String in1 = "src/in1.txt";
        List<String> file1 = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(in1))) {
            file1 = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        String in2 = "src/in2.txt";
        List<String> file2 = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(in2))) {
            file2 = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        String in3 = "src/in3.txt";
        List<String> file3 = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(in3))) {
            file3 = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> allLines = new ArrayList<>();
        allLines.addAll(file1);
        allLines.addAll(file2);
        allLines.addAll(file3);


        Collections.sort(allLines);

        Files.write(Paths.get("out.txt"), allLines, StandardOpenOption.CREATE);
    }
}
