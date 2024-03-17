// Class Solution for merging intervals
class Solution {
    
    // Function to insert newInterval into intervals array
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        // Sorting the intervals array based on the starting point
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        // Creating an ArrayList to store the intervals
        List<int []> list = new ArrayList<>();

        // Initializing the prevInterval to newInterval
        int []prevInterval = newInterval;

        // Looping through the intervals to merge them
        for(int []currInterval:intervals){
            // If the current interval's start is greater than previous interval's end, then we add previous interval
            // into the list and update the previous interval as current interval
            if(currInterval[0] > prevInterval[1]){
                list.add(prevInterval);
                prevInterval = currInterval;
            }
            // If the current interval's end is less than previous interval's start, then we add the current interval
            // to the list
            else if(currInterval[1] < prevInterval[0]){
                list.add(currInterval);
            }
            // If the above conditions fail, then we need to merge the intervals
            else{
                prevInterval[0] = Math.min(prevInterval[0],currInterval[0]);
                prevInterval[1] = Math.max(prevInterval[1],currInterval[1]);
            }
        }    

        // Adding the last interval into the list
        list.add(prevInterval);
        
        // Converting the list into 2D array and returning it
        return list.toArray(new int[list.size()][]);
    }
}