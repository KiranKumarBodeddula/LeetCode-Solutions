class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:piles){
            pq.add(x);
        }

        while(k>0){
            int x=pq.poll();
            pq.add((x+1)/2);
            k--;
        }

        int sum=0;
        for(int x:pq){
            sum+=x;
        }
        return sum;
        
    }
}