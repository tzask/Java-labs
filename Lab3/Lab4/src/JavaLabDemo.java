import java.util.*;

public class JavaLabDemo {
    static boolean isUkrLetter (char charAt) {
        if (0x0400 <= charAt &&
            charAt <= 0x04FF ||
            charAt <= 0x0491) {   //0490 0491 0404 0454 0406 0456 0407 0457
            return true;
        } else return false;
    }
        static int numberOfWordsInALine(String s) {
            int wordCount = 0;
            int letterCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if (isUkrLetter(s.charAt(i))) { letterCount++; }

                if (letterCount > 0 && s.charAt(i) == ' ') {
                    if (i + 1 < s.length() &&
                        s.charAt(i + 1) != ' ') {
                        letterCount = 0;
                        wordCount++;
                    }
                }
            }
            if (letterCount > 0) { wordCount++; }

            return wordCount;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ourString = in.nextLine();

        System.out.println("Number of Ukrainian words in our line:"+numberOfWordsInALine(ourString));
    }
}
