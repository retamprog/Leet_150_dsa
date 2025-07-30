public class lemonade_change {
    // yeah this is a new problem of greedy type..
    // lets see how we can do this..
    public static boolean canGiveChange(int bills[]){
       // yup just think simple code.. you know first i was thinking of  storing the 5s ,10s and 20s dollar bills in some array type shit !!
       // but i can do the problem much more simpler no required to store the 20s bills because it is not being anywhere so we can just store 5s and 10s 
       // and do it in a simple way instead of using all the while loop shit
       int n=bills.length;
       int n5=0;
       int n10=0;
       
       for(int i=0;i<n;i++){
            if(bills[i]==5){
                n5++;
            }
            else if(bills[i]==10){
               n10++;
               if(n5>0){n5--;}
               else{return false;}
            }
            else{
                if(n5>0 && n10>0){
                    n5--;
                    n10--;
                }
                else if(n5>=3){n5-=3;}
                else return false;
            }
       }
       return true;
    }
    public static void main(String args[]){
        int test1[]={5,5,5,10,20};
        int test2[]={5,5,10,10,20};
        int test3[]={5,5,5,20};
        System.out.println(canGiveChange(test1));
        System.out.println(canGiveChange(test2));
        System.out.println(canGiveChange(test3));
    }
    
}
