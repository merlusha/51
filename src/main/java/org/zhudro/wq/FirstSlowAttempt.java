package org.zhudro.wq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by mikalai on 06.02.16.
 */
public class FirstSlowAttempt {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        List<String> stoppingWords = new ArrayList<>();
        List<String> stopWords = Files.readAllLines(Paths.get("src/main/resources/stop_words.txt"));
        if (!stopWords.isEmpty()) {
            String firstLine = stopWords.get(0);
            stoppingWords.addAll(Arrays.asList(firstLine.split(",")));
        }

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/pride-and-prejudice.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                Integer startChar = null;
                int i = 0;
                StringBuilder sb = new StringBuilder(line);
                sb.append('\n');
                for (char c : sb.toString().toCharArray()) {
                    if (startChar == null) {
                        if (Character.isAlphabetic(c)) {
                            startChar = i;
                        }
                    }else{
                        if (!Character.isAlphabetic(c)) {
                            String word = line.substring(startChar, i).toLowerCase();
                            updateFrequencyMap(stoppingWords, wordFrequencyMap, word);
                            startChar = null;
                        }
                    }
                    i++;
                }


            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        long end = System.currentTimeMillis();
        System.out.println("Finished in:"+(end-start)+"ms");
        wordFrequencyMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(25).forEach(entry -> System.out.println(entry.getKey() + " :" + entry.getValue()));
    }

    private static void updateFrequencyMap(List<String> stoppingWords, Map<String, Integer> wordFrequencyMap, String word) {
        if (!stoppingWords.contains(word)) {
            Integer count = wordFrequencyMap.get(word);
            if (count == null) {
                wordFrequencyMap.put(word, 1);
            } else {
                wordFrequencyMap.put(word, count + 1);
            }
        }
    }
}
