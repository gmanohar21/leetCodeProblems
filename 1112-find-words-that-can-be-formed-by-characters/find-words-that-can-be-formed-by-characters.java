class Solution {
	public static int countCharacters(String[] words, String chars) {
		int ans = 0;
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			char charArr[] = word.toCharArray();
			char mainArr[] = chars.toCharArray();
			 char charArr1[]=mainArr;
			int charMatch = 0;
			for (int j = 0; j < charArr.length; j++) {
				for (int k = 0; k < charArr1.length; k++) {
					if(charArr1[k]!='&')
					if (charArr[j] == charArr1[k]) {
						charMatch++;
						charArr1[k]='&';
						break;
					}
				}
			}
			if (charMatch == word.length()) {
				int t = word.length();
				ans += t;
			}
		}
		return ans;
	}
}