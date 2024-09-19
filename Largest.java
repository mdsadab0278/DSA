package Arrays;

public class Largest {
    public static void main(String[] args) {
        int arr[]={10,5,45,23,96,10,80,19};
        int lar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(lar<arr[i]){
                lar=arr[i];
            }
        }
        System.out.println(lar);
    }
}
