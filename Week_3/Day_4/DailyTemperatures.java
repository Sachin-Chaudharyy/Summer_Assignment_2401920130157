class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> idx = new ArrayDeque<>();
        int n = temperatures.length;
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            while(!idx.isEmpty() && temperatures[idx.peek()] < temperatures[i]){
                int pidx = idx.pop();
                res[pidx] = i-pidx; 
            }
            idx.push(i);
        }
        return res;
    }
}
