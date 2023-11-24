package string.lastWordLength;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }

    /**
     * Returns the length of the last word in the input string 's'.
     *
     * @param s the input string
     * @return the length of the last word in the string 's'
     */
    public static int lengthOfLastWord(String s) {
        String sentence = s.trim();
        int counter = 0;

        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) != ' ') {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }
}
