import java.util.Arrays;
public class assign_cookies {
    public static int
    public static int maxCookies(int g[],int s[]){
        // well we solved this problem using sorting giving us a time complexity of (nlogn+mlogm) but i think we can do better
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int count=0;
       while(i<n && j<m){
          if(g[i]<=s[j]){
              count++;
              i++;
          }
          j++;
       }
        return count;
    }
    public static void main(String args[]){
        int g1[]={3,1,2};int s1[]={2,1,3};
        
        System.out.println(maxCookies(g1,s1));
    }
    
}
