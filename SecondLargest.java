package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arrays:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array element:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        /* for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            */
            int first=Integer.MAX_VALUE;int second=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>first){
                    first=second;
                    second=arr[i];
                }
                else if(arr[i]>second && arr[i]!=first){
                    second=arr[i];
                }
            }
            System.out.println(second);
    }
}
