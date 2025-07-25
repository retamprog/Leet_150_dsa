import java.util.HashSet;
public class longestUniqseq{
    // public static int longestUniqSub(String s){
    //     int n=s.length();
    //     int chrIdx[]=new int[128];// this array will store the character occurences index..(the current one) 
    //     //i think this approach should work..

    // }
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
        System.out.println("Length of the longest unique subsequence is "+longest_uniq_sequence(test9));
    }
}
