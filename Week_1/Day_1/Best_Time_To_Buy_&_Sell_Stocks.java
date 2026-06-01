class Prob3 {
  public int totalProfit(int[] arr){
    int profit = 0, buyPrice = arr[0];
    for(int i=1; i<arr.length; i++){
      int curr = arr[i]-buyPrice;
      if(curr > profit){
        profit = curr;
      }
      if(arr[i] < buyPrice){
        buyPrice = arr[i];
      }
    }
    return profit;
  }
}
    
    
