class Prob2 {
  public int removeDuplicates(int[] arr){
    int unique = 0;
    for(int i=1; i<arr.length; i++){
      if(arr[i] != arr[i-1]){
        unique++;
        arr[unique] = arr[i];
      }
    }
    return unique + 1;
  }
}
