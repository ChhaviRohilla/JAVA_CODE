import java.util.*;
public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder();

        String[] sarr = str.trim().split("\\s+");
        for(int i = 0 ; i < sarr.length ; i++){
            s.append(sarr[i].charAt(0));
        }
        String ss = s.toString();
        System.out.println(ss);
    }
}