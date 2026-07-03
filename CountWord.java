import java.util.*;

public class CountWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String S[] = str.split(" ");

        int count = 0 ;
        for(int i = 0; i <S.length; i++){
            if(!S[i].equals("")){
                count++;
            }
        }
        System.out.println(count);

        String sb[] = str.trim().split("\\s+");
        System.out.println(sb.length);
    }
    
}