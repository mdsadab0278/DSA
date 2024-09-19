package Arrays;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={1,5,2,7,3,9,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
