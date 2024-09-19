public class Pallindrome {
    public static void main(String[] args) {
        String str="abba";
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev));
    }
}
