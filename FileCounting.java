import java.io.StringReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCounting {
    FileCounting() {
    }

    public String ScanTheFile(String filename) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ScanString(content);

    }

        public  String  ScanString(String  filecontents)  {

	String line;
        // returns the numbers all formatted for lines, words and characters
        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;

        StringReader inputString = new StringReader(filecontents);
        BufferedReader reader = new BufferedReader(inputString);
        // Reading line by line from the
        // file until a null is returned
        try {
            while ((line = reader.readLine()) != null) {
                sentenceCount++;
                if (line.equals("")) {
                    characterCount++;
                }
                if (!(line.equals(""))) {

                    // characterCount += line.length() + 1;
                    characterCount += line.getBytes("UTF8").length + 1;


                    // \\s+ is the space delimiter in java
                    String[] wordList = line.split("\\s+");

                    countWord += wordList.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String result = String.format("\t%d\t%d\t%d", sentenceCount, countWord, characterCount);
        return result;

        }
}
