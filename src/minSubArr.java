public class minSubArr{
public static int min_sub_arr(int nums[],int target){
   // using the sliding window approach
   int n=nums.length;
   int left=0;
   int sum=0;
   int minLength=Integer.MAX_VALUE;
   for(int right=0;right<n;right++){
       sum+=nums[right];
       while(sum>=target){
          minLength=Math.min(minLength,right-left+1);
          sum-=nums[left];
          left++;
       }
   }
   return minLength;
}
   public static void main(String args[]){
    int nums[]={1,4,4};  // ans : 2
    System.out.println(min_sub_arr(nums,4));
}
}





















 
