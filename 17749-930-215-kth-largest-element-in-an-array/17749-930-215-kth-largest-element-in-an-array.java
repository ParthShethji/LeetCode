class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums){
                        minHeap.add(num); // Insert element into heap

            if(minHeap.size()>k)    minHeap.poll();
        }
        return minHeap.peek();

    }
}