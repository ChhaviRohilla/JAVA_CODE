import java.util.*;

public class NonRepearChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = ' ';

        for(int i = 0 ; i < str.length() ; i++){
            ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.print(ch);
                break;
            }
        }
    }
}