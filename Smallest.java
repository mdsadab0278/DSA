package Arrays;

public class Smallest {
    public static void main(String[] args) {
        int arr[]={10,5,45,23,96,10,80,19,1};
        int smal=arr[0];
        for(int i=0;i<arr.length;i++){
            if(smal>arr[i]){
                smal=arr[i];
            }
        }
        System.out.println(smal);
    }
}
