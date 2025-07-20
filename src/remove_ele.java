public class remove_ele{
    public static int remove_element(int nums[],int val){
          // > okay let say i hit the logic jackpot
          // # i hate leetcode 
         int n=nums.length;
         int i=0;
         int j=n-1;
         int k=0;
         // ! using my prev logic
         // > first i calculate the number of elements that are not equal to val
         // > then do the inplace algo using the while loop to set the elements not equal to val at the front
         for(int num:nums)
          if(num!=val)
           k++; // well apparently this is the answer but we have to also move the non-val elements at the front dont know why??
         
         while(i<j){
            if(nums[i]!=val && nums[j]!=val){i++;}
            // if(nums[i]!=val && nums[j]==val){
            //     i++;j--;
            // }
            else if(nums[i]==val && nums[j]!=val){
                nums[i]=nums[j];
                // System.out.println("hello");
                i++;j--;
            }
            else if(nums[i]==val && nums[j]==val){j--;}
            else{i++;j--;}
         }  
         for(int num:nums){
            System.out.print(num+" ");
         }
         System.out.println();
         return k;
    }
    // so yeah this is the way to doing this code 
    public static int remove_ele_2(int nums[],int val){
       int n=nums.length;
       int i=-1;
       int k=0;
       for(int j=0;j<n;j++){
            if(nums[j]!=val){
	       i++;
	       k++;
	       nums[i]=nums[j];
	    }
	    else{
	      continue;
	    }
       }
       for(int num:nums){
         System.out.print(num+" ");
       }
       System.out.println();
       return k;
    } 
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        // Another test case nums=[3,2,2,3],val=3 --> ans k=2 and nums=[2,2,_,_]
        // ans 
        //System.out.println(remove_element(nums,2));
        System.out.println(remove_ele_2(nums,2));
    }
}
















