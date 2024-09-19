package Numbers;

public class PerfectNum {
    public static void main(String[] args) {
        int n=30,sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum +=i;
            }
        }
        System.out.println(n==sum);
    }
}
