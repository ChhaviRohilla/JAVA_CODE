import java.util.*;

public class Find_CountWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String word = sc.next();

        String[] arr = str.replaceAll("[^A-Za-z ]","").trim().split("\\s+");
        int count = 0;
        for(int i = 0; i <arr.length ; i++){
            if(arr[i].equals(word)){
                count++;
            }
        }
        System.out.println(arr.length);
        System.out.print(count);
    }   
}