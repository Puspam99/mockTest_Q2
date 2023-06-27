public class mockTest_Q2 {
     public static int firstNonRepeatingChar(String s) {
        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isUnique = true;

            // Check if the character is repeated elsewhere in the string
            for (int j = 0; j < s.length(); j++) {
                if (i != j && c == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, return its index
            if (isUnique) {
                return i;
            }
        }

        return -1; // No non-repeating character found, return -1
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("Index of the first non-repeating character in \"" + s1 + "\": " + firstNonRepeatingChar(s1));

      
    }
}
