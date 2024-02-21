package Utilities;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelReaderClass {
    private String filePath;

    public ExcelReaderClass(String filePath) {
        this.filePath = filePath;
    }


    public List<String[]> readKeywords() {
        List<String[]> lines = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] keywords = line.split(",");
                lines.add(keywords);
            }
            System.out.println("FILE READ SUCCESSFULLY");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}

