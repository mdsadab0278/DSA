package Arrays;
import java.util.Arrays;

public class Merge2array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={9,8,7,6,5,4};
        int merg[]=new int[arr.length+arr2.length];
        System.arraycopy(arr,0,merg,0,arr.length);
        System.arraycopy(arr2, 0, merg, arr.length, arr2.length);
        System.out.println(Arrays.toString(merg));
    }
}
