public class EncodedPassword {

    public static void main(String[] args) {
        String input1 = "MACHINE";
        String input2 = "LEARNING";

        String password = generatePassword(input1, input2);
        System.out.println("Password: " + password);
    }

    public static String generatePassword(String word1, String word2) {
        String[] parts1 = splitIntoThreeParts(word1);
        String[] parts2 = splitIntoThreeParts(word2);

        return parts2[0] + parts1[0] + parts1[2] + parts2[2];
    }
    public static String[] splitIntoThreeParts(String word) {
        int len = word.length();
        int rem = len % 3;
        int partSize = len / 3;

        int part1Len, part2Len, part3Len;

        if (rem == 0) {
            part1Len = part2Len = part3Len = partSize;
        } else if (rem == 1) {
            part1Len = partSize;
            part2Len = partSize + 1;
            part3Len = partSize;
        } else { // rem == 2
            part1Len = partSize + 1;
            part2Len = partSize;
            part3Len = partSize + 1;
        }

        String part1 = word.substring(0, part1Len);
        String part2 = word.substring(part1Len, part1Len + part2Len);
        String part3 = word.substring(part1Len + part2Len);

        return new String[]{part1, part2, part3};

    }
}
