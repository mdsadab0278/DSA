package Arrays;

import java.util.HashSet;

public class RemovesDuplicate {
    public static void main(String[] args) {
        int arr[]={2,4,6,1,2,3,45,2,1};
        HashSet<Integer> set=new HashSet<>();
        for(int a:arr){
            set.add(a);
        }
        System.out.println(set);

    }
}
