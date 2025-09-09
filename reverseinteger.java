import java.util.*;
class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}
public class reverseinteger{
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter an integer");
            try{
            int num=sc.nextInt();
            Solution obj=new Solution();
            System.out.println("The reversed integer is:"+obj.reverse((num)));
            }
            catch(Exception e){
                System.out.println("0");
            }
            sc.close();
      }
}
