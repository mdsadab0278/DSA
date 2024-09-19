public class Reverse {
    public static void rev(String str){
        StringBuilder rev=new StringBuilder(str).reverse();
        System.out.println("Result:"+rev);
    }


    public static void st(String str){
        char ch;
        String res="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            res=ch+res;
        }
        System.out.println("Result:"+res);
    }
    public static void revers(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="Welcome to Java";
        rev(str);
        st(str);
        System.out.print("Result:");
        revers(str);

        
    }
}
