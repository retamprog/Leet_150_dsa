public class minSubArr{
public static int min_sub_arr(int nums[],int target){
   // using the sliding window approach
   int n=nums.length;
   int sum=0;
   int minLength=Integer.MAX_VALUE;
   int i=0;int j=0;// here j is the right pointer and i is the left pointer
   while(i<=j){
     sum+=nums[j];
     if(sum>=target && j<n){
	      minLength=Math.min(minLength,j-i+1);
         // System.out.println("Hello");
         System.out.println("minLength---->"+minLength);
         sum-=nums[i];
         i+=1;	
     }
     else  
        j++; 
   }
    return minLength;
}	
public static void main(String args[]){
    int nums[]={2,3,1,2,4,3};  // ans : 2
    System.out.println(min_sub_arr(nums,7));
}
}





















 
