import java.util.*;

public class day4_q3 {
    public String sortVowels(String s) {
        String str = "AEIOUaeiou";
        int n = s.length();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            if (str.indexOf(x) != -1)
                list.add(x);
        }
        Collections.sort(list);
        int l = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char y = s.charAt(i);
            if (str.indexOf(y) != -1) {
                sb.append(list.get(l));
                l++;
            } else {
                sb.append(y);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        day4_q3 obj = new day4_q3();
        String result = obj.sortVowels(input);
        System.out.println("Sorted vowels string:");
        System.out.println(result);
        sc.close();
    }
}
