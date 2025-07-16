public class Modul2 {
    public static String[] splitWord(String word) {
        int len = word.length();
        int rem = len % 3;
        int part1Len = len / 3;
        String part1, part2, part3;

        if (rem == 0) {
            part1 = word.substring(0, part1Len);
            part2 = word.substring(part1Len, part1Len * 2);
            part3 = word.substring(part1Len * 2);
        } else {
            part1 = word.substring(0, part1Len);
            int part2Len = len - (2 * part1Len);
            part2 = word.substring(part1Len, part1Len + part2Len);
            part3 = word.substring(part1Len + part2Len);
        }

        return new String[]{part1, part2, part3};
    }
    public static String generatePassword(String word1, String word2) {
        String[] w1 = splitWord(word1);
        String[] w2 = splitWord(word2);

        return w1[1] + w2[1] + w2[0];
    }
    public static void main(String[] args) {
        String word1 = "WIPRO";
        String word2 = "TECHNOLOGIES";
        System.out.println("Password (Example 1): " + generatePassword(word1, word2));
        word1 = "MACHINE";
        word2 = "LEARNING";
        System.out.println("Password (Example 2): " + generatePassword(word1, word2));
    }
}

