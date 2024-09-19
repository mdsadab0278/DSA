package Numbers;

public class PrimeRange {
    public static void main(String[] args) {
        int start=2,end=100;
        for(int i=start;i<=end;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime && i>1){
                System.out.print(i+" ");
            }
        }
    }
}
