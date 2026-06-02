class Prob3 {
  public double findMaxAverage(int[] arr, int k) {
    double sum = 0;
    for(int i=0; i<k; i++) {
      sum += arr[i];
    }
    double avg = sum/k;
    for(int i=k; i<arr.length; i++) {
      sum += arr[i] - arr[i-k];
      avg = Math.max(avg, sum/k);
    }
    return avg;
  }
}
