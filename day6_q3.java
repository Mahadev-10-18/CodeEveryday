import java.util.*;

public class day6_q3 {
    public static int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap();
        String str="aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int x=map.get(s.charAt(i));
                map.put(s.charAt(i),x+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int maxvowel=0;int maxcons=0;
        for(char x:map.keySet()){
            if(str.indexOf(x)!=-1){
                maxvowel=Math.max(maxvowel,map.get(x));
            }
            else{
                maxcons=Math.max(maxcons,map.get(x));
            }
        }
        return maxcons+maxvowel;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int result=maxFreqSum(s);
         System.out.println("The result is:"+result);
    }
}

