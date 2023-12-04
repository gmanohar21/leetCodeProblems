class Solution {
   
	public static String largestGoodInteger(String num) {
	 String [] check={"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
     for(String c:check){
         if(num.contains(c)){
             return c;
         }
     }
     return "";
	}
}