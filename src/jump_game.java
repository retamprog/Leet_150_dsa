public class jump_game {
    // I think i can solve this problem with the furthest element approach
    // well my solution is greedy approach..
    public static boolean canJump(int nums[]){
        int furthest=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            furthest=Math.max(furthest,i+nums[i]);
            if(furthest>=n-1)
             return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int test1[]={2,3,1,1,4};
        int test2[]={3,2,1,0,4};
        int test3[]={2,5,0,0};
        int test4[]={0,1};
        int test5[]={2,0,0};
        int test6[]={3,0,8,2,0,0,1};
        System.out.println(canJump(test1));
        System.out.println(canJump(test2));
        System.out.println(canJump(test3));
        System.out.println(canJump(test4));
        System.out.println(canJump(test5));
        System.out.println(canJump(test6));
        
        // canJump(test1);
    }
}
