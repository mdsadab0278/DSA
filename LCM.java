package Numbers;

public class LCM {
    public static void main(String[] args) {
        int a=15,b=25;
        int max=a>b?a:b;
        while(true){
            if(max%a==0 && max%b==0){
                break;
            }
            max++;
        }
        System.out.println("Your LCM is:"+max);
    }
}
