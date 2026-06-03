class Solution {
  public int maxArea(int[] nums){
    int max_area = 0, i=0,j=nums.length-1;
    while(i<j){
      max_area = Math.max(max_area, Math.min(nums[i],nums[j])*(j-i));
      if(nums[i] > nums[j]){
        j--;
      }else{
        i++;
      }
    }
    return max_area;
  }
}
