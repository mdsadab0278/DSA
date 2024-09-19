package Numbers;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int m=sc.nextInt();
        System.out.println("Enter the second number:");
        int n=sc.nextInt();
        while(n!=0){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }

        }
        System.out.println("Your GCD is:"+m);
    }
}
