public class majority_ele{
public static int majority_element(int nums[]){
int n=nums.length;
int major=0;
// doing this using the bit manipulation logic
for(int i=0;i<32;i++){
// we will check for each bit of the numbers in nums array  and check for the count being greater than n/2... and based on the count var we are going to create our majority element
   int count=0;
   for(int num:nums){
	   if(((num>>i)&1)==1){
        count++;
      }
   }
   if(count>n/2){
   // here we are going to recreate our majority element
     major|=(1<<i);
   }
}
return major;
}
// So this time we are going to solve the problem using the Boyer Moores majority voting algorithm
// yup it is sweet sexy algorithm and very beautiful solving our problem in o(N) time complexity and o(1) space complexity
public static int majority_element_2(int nums[]){
  int n=nums.length;
  int candidate=0;
  int count=0;
  for(int i=0;i<n;i++){
    if(count==0)
    {
      // when the count is zero set the current element as the candidate element and set the count as 1..	    
      candidate=nums[i];
      count=1;
    }
    else if(candidate==nums[i])
      count++;
    else
      count--;
  }
  return candidate;
  // if majority element always exists , then we do not need to go along with the checking part
//  count=0;
//  for(int i=0;i<n;i++){
//	  if(candidate==nums[i])
//		  count++;
//	  if(count>n/2)
//	    return candidate;
//	  return -1;
//  }
//}
}
public static void main(String args[]){
int nums_1[]={3,2,3};
int nums_2[]={2,2,1,1,1,2,2};
//System.out.println("The majority ele--> "+majority_element(nums_1));
System.out.println("The majority ele--> "+majority_element(nums_2));
System.out.println("The majority ele--> "+majority_element_2(nums_1));
System.out.println("The majority ele--> "+majority_element_2(nums_2));
}
}
