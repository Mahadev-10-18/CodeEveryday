import java.util.*;

public class day6_q1 {
     public static void print_divisors(int n) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list1.add(i);
               if(i!=n/i)
                   list2.add(n/i);
            }
        }
        Collections.reverse(list2);
         for (int num : list1) {
            System.out.print(num + " ");
        }
        for (int num : list2) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        print_divisors(n);
    }
}
