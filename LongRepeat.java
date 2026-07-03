import java.util.*;

public class LongRepeat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        int i = 0;
        do{
            s = s + str.charAt(i);
            i++;
        }while( i < str.length() && !s.contains(String.valueOf(str.charAt(i))));



        System.out.println(s);
    }
}