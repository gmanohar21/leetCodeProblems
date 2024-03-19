class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for(char ch: tasks){
            arr[ch-'A']++;
        }

        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i = 0;i<26;i++){
            if(arr[i]>0){
                pq.add(arr[i]);
            }
        }

        int time = 0;
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        while(!pq.isEmpty() || !q.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int count = pq.poll()-1;
                if(count!=0){
                    q.add(new Pair<>(count, time+n));
                }
            }

            if(!q.isEmpty() && q.peek().getValue() == time){
                pq.offer(q.poll().getKey());
            }
        }
        return time;
    }
}