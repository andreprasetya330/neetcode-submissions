class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Comparator.reverseOrder());
        for(int s: stones){
            maxHeap.offer(s);
        }

        while(maxHeap.size() > 1){
            int r1 = maxHeap.poll();
            int r2 = maxHeap.poll();

            if(r1 > r2){
                maxHeap.offer(r1-r2);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }else{  
            return maxHeap.poll();
        }
    }
}
