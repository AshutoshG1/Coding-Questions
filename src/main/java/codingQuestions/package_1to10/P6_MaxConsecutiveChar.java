package codingQuestions.package_1to10;

public class P6_MaxConsecutiveChar {
    public static void main(String[] args) {
        String str = "aa bb aaa cab";

        char maxChar = getMaxConsecutiveChar(str);
        System.out.println("Character with maximum consecutive occurrence: " + maxChar);
    }

    public static char getMaxConsecutiveChar(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("string is null or empty");
        }

        char maxChar = str.charAt(0);
        char currentChar = str.charAt(0);
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxChar = currentChar;
                }
                currentChar = str.charAt(i);
                currentCount = 1;
            }
        }

        // Final check at the end of the string
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChar = currentChar;
        }

        return maxChar;
    }
}
