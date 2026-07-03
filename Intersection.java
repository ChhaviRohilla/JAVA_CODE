import java.util.*;

public class Intersection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] s1 = new int[n1];
        int[] s2 = new int[n2];

        for(int i = 0; i < n1 ; i++){
            s1[i] = sc.nextInt();
        } 
        
        for(int i = 0; i < n1 ; i++){
            s2[i] = sc.nextInt();
        } 

        int[] s3;
        
        for(int i = 0 ; i < s2.length ; i++){
            for(int j = 0 ; j< s1.length ; j++){
                if(s1[j] == s2[i]){
                    s3[i] = new s1[j];
                }
            }
        }
        for(int i = 0 ; i <s3.length ; i++){
            System.out.print(s3[i] + " ");
        }
    }
}