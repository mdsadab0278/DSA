package Numbers;

public class Armstrong {
    public static void main(String[] args) {
        int n=152,temp=n,sum=0;
        while(n!=0){
            int d=n%10;
            sum +=Math.pow(d,3);
            n=n/10;

        }
        if(temp==sum){
            System.out.println("Yes");
        }
        else
    {
        System.out.println("No");
    }
    }
}
