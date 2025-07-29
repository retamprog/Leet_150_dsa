import java.util.HashSet;
import java.util.Arrays;
public class longestUniqseq{
  // using index character array
    public static int longestUniqSub(String s){
        int n=s.length();
        int chrIdx[]=new int[128];// this array will store the character occurences index..(the current one) 
        //i think this approach should work..
        // this approach will use the same logic as in sliding window;
        Arrays.fill(chrIdx,-1);
        int maxLength=0;
        int left=0;
        for(int right=0;right<n;right++){
            char current=s.charAt(right);
              if(chrIdx[(int)current]==-1){
                 // the element has not yet been visited
                chrIdx[(int)current]=right; 
                maxLength=Math.max(maxLength,right-left+1);
              }
              else{
                // if the character is already recorded in the array then we must move the left pointer and remove 
                // the left characters as we move the left pointer...
                while(left<=chrIdx[(int)current]){
                   chrIdx[(int)s.charAt(left)]=-1;
                   left++;
                }
                chrIdx[(int)current]=right;
              }
        }
        return maxLength;
    }
    public static int optimized_slidingwindow(String s){
        // yup this method will do the optimized sliding window problem using optimized left pointer movement logic...
	int n=s.length();
	int left=0;
	int chrIdx[]=new int[128];
	int maxLength=0;
	for(int right=0;right<n;right++){
	   // current storing the current character..
	   char current=s.charAt(right);
	   // starting of the loop we will check the position of the left pointer and update it if required
	   left=Math.max(chrIdx[current]+1,left);
           maxLength=Math.max(maxLength,right-left+1);
	   chrIdx[current]=right;// updating the new pos of the current character after moving the left pointer to the repeated character one place after it... 
	}
	return maxLength;
    }
    // using hashset
    public static int longest_uniq_sequence(String test){
        // going to do the problem using hashset 
        // so after a dry run i got where my problem was .. 
        // properly understand the algo of the sliding window and do the problems
        int n=test.length();
        int maxLength=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        char str[]=test.toCharArray();
        for(int right=0;right<n;right++){
              if(set.contains(str[right])){
                 // ! removing the left pointer character
                 int nleft=test.indexOf(str[right],left);
                 while(left<=nleft){set.remove(str[left]);left++;}
                 set.add(str[right]);        
              }
              else{
                //if the character is not present in set
                set.add(str[right]);
                maxLength=Math.max(maxLength,right-left+1);
              }
        }
        return maxLength;

    }

    public static void main(String args[]){
        String test1="abcabcbb";
        String test2="pwwkew";
        String test3="b";
        String test4="tmmuzxt";
        String test5="dvdf";
        String test6="ckilbkd";
        String test7="asjrgapa";
        String test8="dgqravdftuhmkbol,[]";
        String test9="eeydgwdykpv";
        // System.out.println("Length of the longest unique subsequence is "+longest_uniq_sequence(test9));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test1));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test2));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test3));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test4));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test5));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test6));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test7));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test8));
        System.out.println("Max longest uniq substring.. "+optimized_slidingwindow(test9));
    }
}




