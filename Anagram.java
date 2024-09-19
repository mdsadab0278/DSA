import java.util.Scanner;
import java.util.Arrays;


public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=sc.next();
        System.out.println("Enter the second string:");
        String str2=sc.next();
        char []arr1=str1.toLowerCase().toCharArray();
        char []arr2=str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        
    }
}
