class Solution {
    public static int countCharacters(String[] words, String chars) {
        // Initialize a variable to store the sum of lengths
        int ans = 0;
        
        // Iterate through each word in the array
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] charArr = word.toCharArray();
            char[] mainArr = chars.toCharArray();
            
            // Iterate through each character in the word
            boolean canFormWord = true;
            for (int j = 0; j < charArr.length; j++) {
                boolean charFound = false;
                
                // Check if the character exists in chars and hasn't been used before
                for (int k = 0; k < mainArr.length; k++) {
                    if (mainArr[k] != '&') {
                        if (charArr[j] == mainArr[k]) {
                            charFound = true;
                            mainArr[k] = '&';  // Mark the character as used
                            break;
                        }
                    }
                }
                
                // If character not found or already used, break the loop
                if (!charFound) {
                    canFormWord = false;
                    break;
                }
            }
            
            // If the word can be formed, update the sum
            if (canFormWord) {
                ans += word.length();
            }
        }
        
        // Return the final sum
        return ans;
    }
}