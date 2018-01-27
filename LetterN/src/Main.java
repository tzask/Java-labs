import java.util.StringTokenizer;

    public class Main {
    public static void numOfLetters (String[] str, char ch) {
        int sum = 0;
        if (str.length > 0) {
            for (int i = 0; i < str.length; i++) {
                if (str[i] == null || str[i].isEmpty()) System.out.println("One of the strings in the array is empty");
                else {
                    StringTokenizer st = new StringTokenizer(str[i]);
                    while (st.hasMoreTokens()) {
                        String ourS = st.nextToken();
                        int chCount = 0;
                        for (int j = 0; j < ourS.length(); j++) {
                            if (ourS.charAt(j) == ch) chCount++;
                        }
                        if (chCount > 0) sum++;
                    }
                }
            }
            System.out.println(sum);
        } else System.out.println("This array is empty.");
    }

    public static void main(String[] args) {
        String str[] = new String[4];
        str[0] = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, " +
                "and specifically designed to have as few implementation dependencies as possible";
        str[1] = "The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses.";
        str[2] = "James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991";
        char ch = 'a';
        String str2[] = new String[0];
        System.out.println("Array ch:");
        numOfLetters(str, ch);
        System.out.println();
        System.out.println("Array ch2:");
        numOfLetters(str2,ch);

    }
}
