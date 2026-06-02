class Prob1 {
  public int maxSubArray(int[] arr) {
    int res = arr[0];
    int maxCurrSum = arr[0];
    for(int i=1; i<arr.length; i++) {
      maxCurrSum = Math.max(maxCurrSum + arr[i], arr[i]);
      res = Math.max(res, maxCurrSum);
    }
    return res;
  }
}
