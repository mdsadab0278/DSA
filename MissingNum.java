package Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};
        int n=arr.length+1;
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("Result:"+(total-sum));

        
        
        
        
        
        /*
        int arr[]={1,2,3,5,6};
        int n=arr.length+1;
        int total=n*(n+1)/2;
        for(int i:arr){
            total -=i;
        }
        System.out.println(total);
        */
    }
}
