package Numbers;

public class CountNumOfDigit {
    
    /*
     
     public static void main(String[] args) {
        int n=10245,count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("Result:"+count);
        */

        public static void main(String[] args) {
            int n=1230044;
            int count=String.valueOf(n).length();
            System.out.println(count);
        }
    }

