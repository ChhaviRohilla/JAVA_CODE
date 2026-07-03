import java.util.*;
public class LetterIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        int c=0;
        
        if(s.contains(String.valueOf(ch))){
            System.out.println(s.indexOf(ch));
        }
        else{
            System.out.println("NA");
        }
    }
}