import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args){
        if (args.length != 1) {
            System.err.println("Usage: java WordCounter <filename>");
            return;
        }

        String filename = args[0];
        try{
            Scanner scan = new Scanner(new File(filename));
            int wordCount = 0;
            HashSet<String> uniqueWords = new HashSet<String>();
            double start = System.nanoTime();
            while(scan.hasNext()){
                String word = scan.next().toLowerCase();
                wordCount++;
                uniqueWords.add(word);
            }
            double Time = (System.nanoTime() - start) / 1e9;
            System.out.println("Elapsed Time " + Time);
            System.out.println("Total Words " + wordCount);
            System.out.println("Unique Word Count " + uniqueWords.size());
            scan.close();
        }
        catch(FileNotFoundException e){
            System.err.println("Unable to open file, ensure executable was called with a valid filename to analyze");
            e.printStackTrace();
        }
    }
}