import java.util.* ;

public class Word_Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //1st Method
        String S[] = str.split(" ");
        int count = 0 ;
        for(int i = 0; i <S.length; i++){
            if(!S[i].equals("")){
                if(S[i].charAt(0) == 'a' ||S[i].charAt(0) == 'e' ||S[i].charAt(0) == 'i' ||S[i].charAt(0) == 'o' ||S[i].charAt(0) == 'u' ){
                    count++;
                }
            }
        }
        System.out.println(count);

        //2nd method
        int count2 = 0;
        String sb[] = str.trim().split("\\s+");
        for(int i = 0 ; i <sb.length; i++){
            if(sb[i].charAt(0) == 'a' ||sb[i].charAt(0) == 'e' ||sb[i].charAt(0) == 'i' ||sb[i].charAt(0) == 'o' ||sb[i].charAt(0) == 'u' ){
                count2++;
            }
        }
        System.out.println(count2);
    }
}