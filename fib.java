import java.util.*;

public class fib{
    public static void fibb(int n){
        if(n <= 0){
            System.out.println("invalid");
        }
        int count = n;
        int n1 = 0;
        int n2 = 1;
        
        System.out.print(n1 + " ");
        while(count!=0){
            if(n>=2){

                System.out.print(n2 + " ");
                int temp = n1;
                n1 = n2;
                n2 = temp + n2;
               
                count --;
            }
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        fibb(num);
    }
}